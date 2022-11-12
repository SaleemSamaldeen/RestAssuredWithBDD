package stepDefinitions;

import java.util.Map;

public class CarBrands {


    private Integer page;
    private Integer pageSize;
    private Integer totalPageCount;
    private Map<String, String> wkda;

    public CarBrands() {

    }

    public CarBrands(Integer page, Integer pageSize, Integer totalPageCount, Map<String, String> wkda) {
        this.page = page;
        this.pageSize = pageSize;
        this.totalPageCount = totalPageCount;
        this.wkda = wkda;
    }

    public Integer getPage() {
        return page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public Integer getTotalPageCount() {
        return totalPageCount;
    }

    public Map<String, String> getWkda() {
        return wkda;
    }


}
