package org.knowm.xchange.examples.cexio.marketdata;

import java.io.IOException;
import java.util.List;

import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeFactory;
import org.knowm.xchange.cexio.CexIOExchange;
import org.knowm.xchange.cexio.service.CexIOMarketDataService;
import org.knowm.xchange.currency.Currency;
import org.knowm.xchange.currency.CurrencyPair;
import org.knowm.xchange.dto.marketdata.Trade;
import org.knowm.xchange.dto.marketdata.Trades;
import org.knowm.xchange.service.marketdata.MarketDataService;

/**
 * Author: brox Since: 2/6/14
 */

public class TradesDemo {

    public static void main(String[] args) throws IOException {

        // Use the factory to get Cex.IO exchange API using default settings
        Exchange exchange = ExchangeFactory.INSTANCE.createExchange(CexIOExchange.class.getName());

        // Interested in the public market data feed (no authentication)
        CexIOMarketDataService marketDataService = (CexIOMarketDataService) exchange.getMarketDataService();

        // Get the latest trade data for GHs/BTC since tid=5635556
        Trades trades = marketDataService.getTrades(new CurrencyPair(Currency.BTC, Currency.USD), 4473577);

        List<Trade> tardeList = trades.getTrades();

        System.out.println("Trades Size= " + trades.getTrades().size());
        System.out.println(trades.toString());


    }

}
