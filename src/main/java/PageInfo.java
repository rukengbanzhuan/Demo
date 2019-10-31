import com.google.common.base.MoreObjects;

/**
 * Created by wdy on 2019/1/10.
 */

public class PageInfo {
        public static final String LIMIT = "limit";
    public static final String OFFSET = "offset";
    private Integer offset;
    private Integer limit;
    public PageInfo(Integer pageNo, Integer size) {
        pageNo = (Integer) MoreObjects.firstNonNull(pageNo, Integer.valueOf(1));
        size = (Integer)MoreObjects.firstNonNull(size, Integer.valueOf(20));
        this.limit = Integer.valueOf(size.intValue() > 0?size.intValue():20);
        this.offset = Integer.valueOf((pageNo.intValue() - 1) * size.intValue());
        this.offset = Integer.valueOf(this.offset.intValue() > 0?this.offset.intValue():0);
    }


}