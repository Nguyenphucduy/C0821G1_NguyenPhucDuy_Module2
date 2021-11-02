package l20_structural_design_pattern.demo.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

    private Internet realInternet = new RealInternet();
    private static List<String> bannedSites; // danh sách web ko dc truy cập

    static
    {
        bannedSites = new ArrayList<>();
        bannedSites.add("facebook.com");
        bannedSites.add("youtube.com");
        bannedSites.add("nhaccuatui.com");
        bannedSites.add("mp3.zing.vn");
    }

    @Override
    public void connectTo(String serverHost) throws Exception {
        if (bannedSites.contains(serverHost.toLowerCase())) {
            throw new Exception("Dang học, nen tap trung." +
                    " Khong duoc truy cap cac web giai tri.");
        }
        realInternet.connectTo(serverHost); //chuyển trang đích
    }
}
