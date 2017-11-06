package stadium.builder;

import stadium.model.Sell;
import stadium.model.SellEntre;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ClientBuilders {
    public static void appendSellEntres(Sell sell, List<SellEntre> sellEntres, List<Map<String, Object>> data) {
        List<Map<String, Object>> mappedSellEntres = new ArrayList<>();
        sellEntres.forEach(item -> mappedSellEntres.add(item.getMap()));
        Map<String, Object> mappedSell = sell.getMap();
        mappedSell.put("sellEntres", mappedSellEntres);
        data.add(mappedSell);
    }
    public static void setSellsSize(List<Sell> sells, Map<String, Object> data) {
        data.put("size", sells.size());
    }
}
