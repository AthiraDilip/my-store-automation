package enums;

public enum PageName {
    HOME_PAGE("HOME"),
    SHOPPING_CART_PAGE("SHOPPING CART");

    private final String pageName;

    PageName(String pageName) {
        this.pageName = pageName;
    }

    public static PageName getPageName(String pageLookUpValue) {
        for (PageName page : PageName.values()) {
            if (page.pageName.equalsIgnoreCase(pageLookUpValue)) {
                return page;
            }
        }
        return null;
    }

}
