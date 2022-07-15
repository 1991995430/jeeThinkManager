package com.jeethink.common.utils;

import com.google.common.base.Strings;
import jersey.repackaged.com.google.common.collect.Lists;
import net.sf.cglib.beans.BeanCopier;
import net.sf.cglib.core.Converter;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

public class ICEBeanCopierUtils {
	private static final Logger logger = LoggerFactory.getLogger(BeanCopier.class);
	private static final Map<String, BeanCopier> beanCopierMap = new HashMap<String, BeanCopier>();

	/**
	 * 格式日期
	 */

	public static final String FORMAT_YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

	private static String generateKey(Class<?> class1, Class<?> class2) {
		return class1.toString() + class2.toString();
	}

	/**
	 * 
	 * @Title: copyProperties
	 * @param source
	 *            资源类
	 * @param target
	 *            目标类
	 */
	public static void copyProperties(Object source, Object target) {
		copyProperties(source, target, true);
	}

	/**
	 * useConverter = true时使用默认转换器，实现名称相同，类型不同的数据转换
	 * 
	 * @Title: copyProperties
	 * @param source
	 *            资源类
	 * @param targetClass
	 *            目标类
	 */
	public static <T> T copyProperties(Object source, Class<T> targetClass) {
		return copyProperties(source, targetClass, true);
	}

	/**
	 * useConverter = true时使用默认转换器，实现名称相同，类型不同的数据转换
	 * 
	 * @Title: copyProperties
	 * @param source
	 *            资源类
	 * @param target
	 *            目标类
	 * @param useConverter
	 *            是否使用转换器，true时使用默认转换器
	 */
	public static void copyProperties(Object source, Object target, boolean useConverter) {
		String beanKey = generateKey(source.getClass(), target.getClass());
		BeanCopier copier = null;
		if (!beanCopierMap.containsKey(beanKey)) {
			copier = BeanCopier.create(source.getClass(), target.getClass(), useConverter);
			beanCopierMap.put(beanKey, copier);
		} else {
			copier = beanCopierMap.get(beanKey);
		}
		if (useConverter) {
			SimpleConverter converter = new SimpleConverter();
			copier.copy(source, target, converter);
		} else {
			copier.copy(source, target, null);
		}
	}

	/**
	 * useConverter = true时使用默认转换器，实现名称相同，类型不同的数据转换
	 * 
	 * @Title: copyProperties
	 * @param source
	 *            资源类
	 * @param targetClass
	 *            目标类
	 * @param useConverter
	 *            是否使用转换器，true时使用默认转换器
	 */
	public static <T> T copyProperties(Object source, Class<T> targetClass, boolean useConverter) {
		return copyProperties(source, targetClass, useConverter, null);
	}

	/**
	 * useConverter = true时使用默认转换器，实现名称相同，类型不同的数据转换
	 * 
	 * @Title: copyProperties
	 * @param source
	 *            资源类
	 * @param targetClass
	 *            目标类
	 * @param useConverter
	 *            是否使用转换器，true时使用默认转换器
	 * @param dateFormate
	 *            如果存在日期型属性，设置日期型属性的转换格式
	 */
	public static <T> T copyProperties(Object source, Class<T> targetClass, boolean useConverter, String dateFormate) {
		T target = null;
		try {
			target = targetClass.newInstance();

			String beanKey = generateKey(source.getClass(), targetClass);
			BeanCopier copier = null;
			if (!beanCopierMap.containsKey(beanKey)) {
				copier = BeanCopier.create(source.getClass(), targetClass, useConverter);
				beanCopierMap.put(beanKey, copier);
			} else {
				copier = beanCopierMap.get(beanKey);
			}
			if (useConverter) {
				SimpleConverter converter = new SimpleConverter(dateFormate);
				copier.copy(source, target, converter);
			} else {
				copier.copy(source, target, null);
			}
		} catch (InstantiationException | IllegalAccessException e) {
			logger.error("", e);
		}

		return target;
	}

	/**
	 * useConverter = true时使用默认转换器，实现名称相同，类型不同的数据转换
	 * 
	 * @Title: copyProperties
	 * @param source
	 *            资源类
	 * @param targetClass
	 *            目标类
	 * @param useConverter
	 *            是否使用转换器，true时使用默认转换器
	 */
	public static <T> T copyProperties(Object source, Class<T> targetClass, Converter useConverter) {
		T target = null;
		try {
			target = targetClass.newInstance();

			String beanKey = generateKey(source.getClass(), targetClass);
			BeanCopier copier = null;
			if (!beanCopierMap.containsKey(beanKey)) {
				copier = BeanCopier.create(source.getClass(), targetClass, true);
				beanCopierMap.put(beanKey, copier);
			} else {
				copier = beanCopierMap.get(beanKey);
			}
			copier.copy(source, target, useConverter);
		} catch (InstantiationException | IllegalAccessException e) {
			logger.error("", e);
		}

		return target;
	}
	
	/**
	 * 
	 * @Description (TODO对List集合类进行拷贝)
	 * @param froms
	 * @param to
	 * @return
	 */
	public static <T,E> List<T> copyList2List(List<E> froms, Class<T> to, boolean useConverter) {
	    if(null == froms || froms.size() == 0){
            return Lists.newArrayListWithCapacity(0);
        }
	    List<T> targetList = Lists.newArrayListWithCapacity(froms.size());
        for(Object item : froms){
            T targetObj = ICEBeanCopierUtils.copyProperties(item, to, useConverter);
            targetList.add(targetObj);
        }
	    
	    return targetList;
	}

	public static <T,E> List<T> copyList2List(List<E> froms, Class<T> to, String dateFormat) {
		if(null == froms || froms.size() == 0){
			return Lists.newArrayListWithCapacity(0);
		}
		List<T> targetList = Lists.newArrayListWithCapacity(froms.size());
		for(Object item : froms){
			T targetObj = ICEBeanCopierUtils.copyProperties(item, to, true,dateFormat);
			targetList.add(targetObj);
		}

		return targetList;
	}


	/**
	 * 修改转换逻辑适合ICE
	 */
	static class SimpleConverter implements Converter {

		private String format = FORMAT_YYYY_MM_DD_HH_MM_SS;
		private SimpleDateFormat sdf = null;

		public SimpleConverter() {
			sdf = new SimpleDateFormat(FORMAT_YYYY_MM_DD_HH_MM_SS);
		}

		public SimpleConverter(String format) {
			if (StringUtils.isNotEmpty(format)) {
				this.format = format;
				sdf = new SimpleDateFormat(format);
			} else {
				sdf = new SimpleDateFormat(FORMAT_YYYY_MM_DD_HH_MM_SS);
			}
		}

		@SuppressWarnings("rawtypes")
		@Override
		public Object convert(Object value, Class target, Object context) {
			try {
				// 空字符串 或者 null 直接返回 null
				if (value instanceof String) {
					if (Strings.isNullOrEmpty(value.toString())) {
						return null;
					}
					if ("Empty_String".equalsIgnoreCase(value.toString())) {
						if (target.equals(String.class)) {
							return "";
						} else {
							value = null;
						}
					}
				}

				// 类型相同
				if (value == null || target.equals(value.getClass()) || target.getName().equalsIgnoreCase(value.getClass().getName())) {
					return value;
				}
				// 源为Integer型
				else if (value instanceof Integer) {
					if (target.equals(String.class)) {
						return String.valueOf(value);
					}
					if (target.equals(Integer.TYPE)) {
						return value;
					}

					return value;
				}
				// 源为int型
				else if (Integer.TYPE.equals(value.getClass())) {
					if (target.equals(String.class)) {
						return String.valueOf(value);
					}
					/*
					 * if (target.equals(Integer.class)) { return value; }
					 */
					return value;
				}
				// 源为Long型
				else if (value instanceof Long) {
					if (target.equals(String.class)) {
						return String.valueOf(value);
					}
					return value;
				}
				// 源为String型
				else if (value instanceof String) {
					// 目标为Integer
					if (target.equals(Integer.class) || target.equals(Integer.TYPE)) {
						if (StringUtils.isNotEmpty(value.toString())) {
							return Integer.parseInt((String) value);
						}
						return null;
					}
					// 目标为Long
					if (target.equals(Long.class) || target.equals(Long.TYPE)) {
						if (StringUtils.isNotEmpty(value.toString())) {
							return Long.valueOf((String) value);
						}
						return null;
					}
					// 目标为Date 日期型
					if (target.equals(Date.class)) {
						if (StringUtils.isNotEmpty(value.toString())) {
							String date = value.toString();
							if (value.toString().length() < format.length()) {
								date = date + " 00:00:00";
							}
							return sdf.parseObject(date);
						}
						return null;
					}
					try {
					// 目标为 BigDecimal
					if (target.equals(BigDecimal.class)) {
						if (StringUtils.isNotEmpty(value.toString())) {
							return new BigDecimal(value.toString());
						}
						return null;
					}
					} catch (Exception e) {
						 e.printStackTrace();
					}

					return value;
				}
				// 源为Date型
				else if (value instanceof Date) {
					// 模板为String
					if (target.equals(String.class)) {
						return sdf.format((Date) value);
					}
					// 目标为Long
					if (target.equals(Long.class) || target.equals(Long.TYPE)) {
						return ((Date) value).getTime();
					}
					// 模板为Integer
					if (target.equals(Integer.class) || target.equals(Integer.TYPE)) {
						return Math.toIntExact(((Date) value).getTime());
					}

					return value;

				}
				// 源为Byte型
				else if (value instanceof Byte) {
					if (target.equals(String.class)) {
						return String.valueOf(value);
					}
					return value;
				}
				else if (value instanceof BigDecimal) {
					BigDecimal bd = (BigDecimal) value;
					return bd.toPlainString();
				}
				// 原属性为数组，目标为List
				else if (value.getClass().isArray()) {
					if (target.equals(List.class)) {
						List list = new ArrayList();
						for (Object obj : (Object[]) value) {
							list.add(ICEBeanCopierUtils.copyProperties(obj, obj.getClass(), true));
						}
						return list;
					}
				}
				//  原属性为List，目标为数组
				else if (value instanceof List) {
					if (target.isArray()) {
						return ((List) value).toArray();
					}
				}
			} catch (Exception e) {
				logger.error("属性复制异常", e);
			}
			return null;
		}
	}
	
}
