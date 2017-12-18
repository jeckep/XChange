package org.knowm.xchange.cexio.dto.trade;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * Author: brox Since: 2/5/14
 */
public class CexIOInstantOrder {

  private final long id;
  private final long time;
  private final Type type;
  private final String message;
  private final BigDecimal symbol1Amount;
  private final BigDecimal symbol2Amount;

  /**
   * non-JSON fields
   */
  private String tradableIdentifier;
  private String transactionCurrency;

  /**
   * Constructor
   *
   * @param id
   * @param time
   * @param type
   * @param message
   * @param symbol1Amount
   * @param symbol2Amount
   */
  public CexIOInstantOrder(@JsonProperty("id") long id, @JsonProperty("time") long time, @JsonProperty("type") Type type,
                           @JsonProperty("message") String message,
                           @JsonProperty("symbol1Amount") BigDecimal symbol1Amount,
                           @JsonProperty("symbol2Amount") BigDecimal symbol2Amount) {
    this.id = id;
    this.time = time;
    this.type = type;
    this.message = message;
    this.symbol1Amount = symbol1Amount;
    this.symbol2Amount = symbol2Amount;
  }

  public long getId() {

    return id;
  }

  public long getTime() {

    return time;
  }

  public Type getType() {

    return type;
  }



  public String getTradableIdentifier() {

    return tradableIdentifier;
  }

  public void setTradableIdentifier(String tradableIdentifier) {

    this.tradableIdentifier = tradableIdentifier;
  }

  public String getTransactionCurrency() {

    return transactionCurrency;
  }

  public void setTransactionCurrency(String transactionCurrency) {

    this.transactionCurrency = transactionCurrency;
  }

  @Override
  public String toString() {

    return String.format("Order{id=%s, time=%s, type=%s, message=%s, symbol1Amount=%s, symbol2Amount=%s}", id, time, type, message, symbol1Amount, symbol2Amount);
  }

  public enum Type {

    buy, sell
  }

}
