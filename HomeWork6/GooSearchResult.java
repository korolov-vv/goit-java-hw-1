package HomeWork6;

import java.util.Arrays;

public class GooSearchResult {
    private String url;

    public GooSearchResult(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String parseDomain(){
        String[] strArr = url.split("/");
        return strArr[2];
    }
}
class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}