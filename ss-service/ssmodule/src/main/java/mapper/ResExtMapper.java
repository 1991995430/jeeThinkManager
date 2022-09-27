package mapper;

import java.util.List;

import com.ss.up.model.ResExt;
import com.ss.up.model.ResExtCriteria;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ResExtMapper {
    int countByExample(ResExtCriteria example);

    int deleteByExample(ResExtCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(ResExt record);

    int insertSelective(ResExt record);

    List<ResExt> selectByExampleWithBLOBsWithRowbounds(ResExtCriteria example, RowBounds rowBounds);

    List<ResExt> selectByExampleWithBLOBs(ResExtCriteria example);

    List<ResExt> selectByExampleWithRowbounds(ResExtCriteria example, RowBounds rowBounds);

    List<ResExt> selectByExample(ResExtCriteria example);

    ResExt selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ResExt record, @Param("example") ResExtCriteria example);

    int updateByExampleWithBLOBs(@Param("record") ResExt record, @Param("example") ResExtCriteria example);

    int updateByExample(@Param("record") ResExt record, @Param("example") ResExtCriteria example);

    int updateByPrimaryKeySelective(ResExt record);

    int updateByPrimaryKeyWithBLOBs(ResExt record);

    int updateByPrimaryKey(ResExt record);
}