/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Response;

import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Hady
 */
public class Transaction {
    private String Date;
    private String Time;
    private String TID;
    private String MID;
    private String Txn;
    private String Batch;
    private String Invoice;
    private String EcrRefNo;
    private String Card;
    private String Entry;
    private String Amount;
    private String Currency;
    private String RespCode;
    private String RespMsg;
    private String RRN;
    private String Auth;
    private String CVM;
    private String AID;
    private String TVR;
    private String TC;
    private String CardIssuer;
    private String CardholderName;

    public Transaction() {
    }
    
    public Transaction(JSONObject TOut) {
        try {
            this.Date = TOut.getString("Date");
            this.Time = TOut.getString("Time");
            this.TID = TOut.getString("TID");
            this.MID = TOut.getString("MID");
            this.Txn = TOut.getString("Txn");
            this.Batch = TOut.getString("Batch");
            this.Invoice = TOut.getString("Invoice");
            this.EcrRefNo = TOut.getString("EcrRefNo");
            this.Card = TOut.getString("Card");
            this.Entry = TOut.getString("Entry");
            this.Amount = TOut.getString("Amount");
            this.Currency = TOut.getString("Currency");
            this.RespCode = TOut.getString("RespCode");
            this.RespMsg = TOut.getString("RespMsg");
            this.RRN = TOut.getString("RRN");
            this.Auth = TOut.getString("Auth");
            this.CVM = TOut.getString("CVM");
            this.AID = TOut.getString("AID");
            this.TVR = TOut.getString("TVR");
            this.TC = TOut.getString("TC");
            this.CardIssuer = TOut.getString("CardIssuer");
            this.CardholderName = TOut.getString("CardholderName");
        } catch (JSONException ex) {
        }
    }

    public Transaction(String Date, String Time, String TID, String MID, String Txn, String Batch, String Invoice, String EcrRefNo, String Card, String Entry, String Amount, String Currency, String RespCode, String RespMsg, String RRN, String Auth, String CVM, String AID, String TVR, String TC, String CardIssuer, String CardholderName) {
        this.Date = Date;
        this.Time = Time;
        this.TID = TID;
        this.MID = MID;
        this.Txn = Txn;
        this.Batch = Batch;
        this.Invoice = Invoice;
        this.EcrRefNo = EcrRefNo;
        this.Card = Card;
        this.Entry = Entry;
        this.Amount = Amount;
        this.Currency = Currency;
        this.RespCode = RespCode;
        this.RespMsg = RespMsg;
        this.RRN = RRN;
        this.Auth = Auth;
        this.CVM = CVM;
        this.AID = AID;
        this.TVR = TVR;
        this.TC = TC;
        this.CardIssuer = CardIssuer;
        this.CardholderName = CardholderName;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public String getTID() {
        return TID;
    }

    public void setTID(String TID) {
        this.TID = TID;
    }

    public String getMID() {
        return MID;
    }

    public void setMID(String MID) {
        this.MID = MID;
    }

    public String getTxn() {
        return Txn;
    }

    public void setTxn(String Txn) {
        this.Txn = Txn;
    }

    public String getBatch() {
        return Batch;
    }

    public void setBatch(String Batch) {
        this.Batch = Batch;
    }

    public String getInvoice() {
        return Invoice;
    }

    public void setInvoice(String Invoice) {
        this.Invoice = Invoice;
    }

    public String getEcrRefNo() {
        return EcrRefNo;
    }

    public void setEcrRefNo(String EcrRefNo) {
        this.EcrRefNo = EcrRefNo;
    }

    public String getCard() {
        return Card;
    }

    public void setCard(String Card) {
        this.Card = Card;
    }

    public String getEntry() {
        return Entry;
    }

    public void setEntry(String Entry) {
        this.Entry = Entry;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    public String getRespCode() {
        return RespCode;
    }

    public void setRespCode(String RespCode) {
        this.RespCode = RespCode;
    }

    public String getRespMsg() {
        return RespMsg;
    }

    public void setRespMsg(String RespMsg) {
        this.RespMsg = RespMsg;
    }

    public String getRRN() {
        return RRN;
    }

    public void setRRN(String RRN) {
        this.RRN = RRN;
    }

    public String getAuth() {
        return Auth;
    }

    public void setAuth(String Auth) {
        this.Auth = Auth;
    }

    public String getCVM() {
        return CVM;
    }

    public void setCVM(String CVM) {
        this.CVM = CVM;
    }

    public String getAID() {
        return AID;
    }

    public void setAID(String AID) {
        this.AID = AID;
    }

    public String getTVR() {
        return TVR;
    }

    public void setTVR(String TVR) {
        this.TVR = TVR;
    }

    public String getTC() {
        return TC;
    }

    public void setTC(String TC) {
        this.TC = TC;
    }

    public String getCardIssuer() {
        return CardIssuer;
    }

    public void setCardIssuer(String CardIssuer) {
        this.CardIssuer = CardIssuer;
    }

    public String getCardholderName() {
        return CardholderName;
    }

    public void setCardholderName(String CardholderName) {
        this.CardholderName = CardholderName;
    }
    
    public String ShowTransaction(){
        return "Date = "+this.getDate()+" - \nTime = "+this.getTime()+" - \nTID = "+this.getTID()+" - \nMID = "+this.getMID()
        +" - \nTxn = "+this.getTxn()+" - \nBatch = "+this.getBatch()+" - \nInvoice = "+this.getInvoice()
        +" - \nEcrRefNo = "+this.getEcrRefNo()+" - \nCard = "+this.getCard()+" - \nEntry = "+this.getEntry()+" - \nAmount = "+this.getAmount()
        +" - \nCurrency = "+this.getCurrency()+" - \nRespCode = "+this.getRespCode()+" - \nRespMsg = "+this.getRespMsg()
        +" - \nRRN = "+this.getRRN()+" - \nAuth = "+this.getAuth()+" - \nCVM = "+this.getCVM()+" - \nAID = "+this.getAID()
        +" - \nTVR = "+this.getTVR()+" - \nTC = "+this.getTC()+" - \nCardIssuer = "+this.getCardIssuer()+" - \nCardholderName = "+this.getCardholderName();
    }
}
