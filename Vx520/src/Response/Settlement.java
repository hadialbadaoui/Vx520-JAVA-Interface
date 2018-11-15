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
public class Settlement {
    private String Date;
    private String Time;
    private String TID;
    private String MID;
    private String Txn;
    private String Batch;
    private String Currency_LBP;
    private String SaleAmount_LBP;
    private String SaleCount_LBP;
    private String RefundAmount_LBP;
    private String RefundCount_LBP;
    private String VoidAmount_LBP;
    private String VoidCount_LBP;
    private String TotalAmount_LBP;
    private String TotalCount_LBP;
    private String Currency_USD;
    private String SaleAmount_USD;
    private String SaleCount_USD;
    private String RefundAmount_USD;
    private String RefundCount_USD;
    private String VoidAmount_USD;
    private String VoidCount_USD;
    private String TotalAmount_USD;
    private String TotalCount_USD;
    private String RespMsg;

    public Settlement() {
    }
    
    public Settlement(JSONObject SOut) {
        try {
            this.Date = SOut.getString("Date");
            this.Time = SOut.getString("Time");
            this.TID = SOut.getString("TID");
            this.MID = SOut.getString("MID");
            this.Txn = SOut.getString("Txn");
            this.Batch = SOut.getString("Batch");
            this.Currency_LBP = SOut.getString("Currency_LBP");
            this.SaleAmount_LBP = SOut.getString("SaleAmount_LBP");
            this.SaleCount_LBP = SOut.getString("SaleCount_LBP");
            this.RefundAmount_LBP = SOut.getString("RefundAmount_LBP");
            this.RefundCount_LBP = SOut.getString("RefundCount_LBP");
            this.VoidAmount_LBP = SOut.getString("VoidAmount_LBP");
            this.VoidCount_LBP = SOut.getString("VoidCount_LBP");
            this.TotalAmount_LBP = SOut.getString("TotalAmount_LBP");
            this.TotalCount_LBP = SOut.getString("TotalCount_LBP");
            this.Currency_USD = SOut.getString("Currency_USD");
            this.SaleAmount_USD = SOut.getString("SaleAmount_USD");
            this.SaleCount_USD = SOut.getString("SaleCount_USD");
            this.RefundAmount_USD = SOut.getString("RefundAmount_USD");
            this.RefundCount_USD = SOut.getString("RefundCount_USD");
            this.VoidAmount_USD = SOut.getString("VoidAmount_USD");
            this.VoidCount_USD = SOut.getString("VoidCount_USD");
            this.TotalAmount_USD = SOut.getString("TotalAmount_USD");
            this.TotalCount_USD = SOut.getString("TotalCount_USD");
            this.RespMsg = SOut.getString("RespMsg");
        } catch (JSONException ex) {
        }
    }

    public Settlement(String Date, String Time, String TID, String MID, String Txn, String Batch, String Currency_LBP, String SaleAmount_LBP, String SaleCount_LBP, String RefundAmount_LBP, String RefundCount_LBP, String VoidAmount_LBP, String VoidCount_LBP, String TotalAmount_LBP, String TotalCount_LBP, String Currency_USD, String SaleAmount_USD, String SaleCount_USD, String RefundAmount_USD, String RefundCount_USD, String VoidAmount_USD, String VoidCount_USD, String TotalAmount_USD, String TotalCount_USD, String RespMsg) {
        this.Date = Date;
        this.Time = Time;
        this.TID = TID;
        this.MID = MID;
        this.Txn = Txn;
        this.Batch = Batch;
        this.Currency_LBP = Currency_LBP;
        this.SaleAmount_LBP = SaleAmount_LBP;
        this.SaleCount_LBP = SaleCount_LBP;
        this.RefundAmount_LBP = RefundAmount_LBP;
        this.RefundCount_LBP = RefundCount_LBP;
        this.VoidAmount_LBP = VoidAmount_LBP;
        this.VoidCount_LBP = VoidCount_LBP;
        this.TotalAmount_LBP = TotalAmount_LBP;
        this.TotalCount_LBP = TotalCount_LBP;
        this.Currency_USD = Currency_USD;
        this.SaleAmount_USD = SaleAmount_USD;
        this.SaleCount_USD = SaleCount_USD;
        this.RefundAmount_USD = RefundAmount_USD;
        this.RefundCount_USD = RefundCount_USD;
        this.VoidAmount_USD = VoidAmount_USD;
        this.VoidCount_USD = VoidCount_USD;
        this.TotalAmount_USD = TotalAmount_USD;
        this.TotalCount_USD = TotalCount_USD;
        this.RespMsg = RespMsg;
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

    public String getCurrency_LBP() {
        return Currency_LBP;
    }

    public void setCurrency_LBP(String Currency_LBP) {
        this.Currency_LBP = Currency_LBP;
    }

    public String getSaleAmount_LBP() {
        return SaleAmount_LBP;
    }

    public void setSaleAmount_LBP(String SaleAmount_LBP) {
        this.SaleAmount_LBP = SaleAmount_LBP;
    }

    public String getSaleCount_LBP() {
        return SaleCount_LBP;
    }

    public void setSaleCount_LBP(String SaleCount_LBP) {
        this.SaleCount_LBP = SaleCount_LBP;
    }

    public String getRefundAmount_LBP() {
        return RefundAmount_LBP;
    }

    public void setRefundAmount_LBP(String RefundAmount_LBP) {
        this.RefundAmount_LBP = RefundAmount_LBP;
    }

    public String getRefundCount_LBP() {
        return RefundCount_LBP;
    }

    public void setRefundCount_LBP(String RefundCount_LBP) {
        this.RefundCount_LBP = RefundCount_LBP;
    }

    public String getVoidAmount_LBP() {
        return VoidAmount_LBP;
    }

    public void setVoidAmount_LBP(String VoidAmount_LBP) {
        this.VoidAmount_LBP = VoidAmount_LBP;
    }

    public String getVoidCount_LBP() {
        return VoidCount_LBP;
    }

    public void setVoidCount_LBP(String VoidCount_LBP) {
        this.VoidCount_LBP = VoidCount_LBP;
    }

    public String getTotalAmount_LBP() {
        return TotalAmount_LBP;
    }

    public void setTotalAmount_LBP(String TotalAmount_LBP) {
        this.TotalAmount_LBP = TotalAmount_LBP;
    }

    public String getTotalCount_LBP() {
        return TotalCount_LBP;
    }

    public void setTotalCount_LBP(String TotalCount_LBP) {
        this.TotalCount_LBP = TotalCount_LBP;
    }

    public String getCurrency_USD() {
        return Currency_USD;
    }

    public void setCurrency_USD(String Currency_USD) {
        this.Currency_USD = Currency_USD;
    }

    public String getSaleAmount_USD() {
        return SaleAmount_USD;
    }

    public void setSaleAmount_USD(String SaleAmount_USD) {
        this.SaleAmount_USD = SaleAmount_USD;
    }

    public String getSaleCount_USD() {
        return SaleCount_USD;
    }

    public void setSaleCount_USD(String SaleCount_USD) {
        this.SaleCount_USD = SaleCount_USD;
    }

    public String getRefundAmount_USD() {
        return RefundAmount_USD;
    }

    public void setRefundAmount_USD(String RefundAmount_USD) {
        this.RefundAmount_USD = RefundAmount_USD;
    }

    public String getRefundCount_USD() {
        return RefundCount_USD;
    }

    public void setRefundCount_USD(String RefundCount_USD) {
        this.RefundCount_USD = RefundCount_USD;
    }

    public String getVoidAmount_USD() {
        return VoidAmount_USD;
    }

    public void setVoidAmount_USD(String VoidAmount_USD) {
        this.VoidAmount_USD = VoidAmount_USD;
    }

    public String getVoidCount_USD() {
        return VoidCount_USD;
    }

    public void setVoidCount_USD(String VoidCount_USD) {
        this.VoidCount_USD = VoidCount_USD;
    }

    public String getTotalAmount_USD() {
        return TotalAmount_USD;
    }

    public void setTotalAmount_USD(String TotalAmount_USD) {
        this.TotalAmount_USD = TotalAmount_USD;
    }

    public String getTotalCount_USD() {
        return TotalCount_USD;
    }

    public void setTotalCount_USD(String TotalCount_USD) {
        this.TotalCount_USD = TotalCount_USD;
    }

    public String getRespMsg() {
        return RespMsg;
    }

    public void setRespMsg(String RespMsg) {
        this.RespMsg = RespMsg;
    }
    
    public String ShowSettlement(){
        return "Date = "+this.getDate()+" - \nTime = "+this.getTime()+" - \nTID = "+this.getTID()+" - \nMID = "+this.getMID()
        +" - \nTxn = "+this.getTxn()+" - \nBatch = "+this.getBatch()+" - \nCurrency_LBP = "+this.getCurrency_LBP()+" - \nSaleAmount_LBP = "+this.getSaleAmount_LBP()
        +" - \nRefundAmount_LBP = "+this.getSaleCount_LBP()+" - \nRefundAmount_LBP = "+this.getRefundAmount_LBP()+" - \nRefundCount_LBP = "+this.getRefundCount_LBP()
        +" - \nVoidAmount_LBP = "+this.getVoidAmount_LBP()+" - \nVoidCount_LBP = "+this.getVoidCount_LBP()+" - \nTotalAmount_LBP = "+this.getTotalAmount_LBP()
        +" - \nVoidCount_LBP = "+this.getVoidCount_LBP()+" - \nCurrency_USD = "+this.getCurrency_USD()+" - \nSaleAmount_USD = "+this.getSaleAmount_USD()
        +" - \nSaleCount_USD = "+this.getSaleCount_USD()+" - \nRefundAmount_USD = "+this.getRefundAmount_USD()+" - \nRefundCount_USD = "+this.getRefundCount_USD()
        +" - \nVoidAmount_USD = "+this.getVoidAmount_USD()+" - \nVoidCount_USD = "+this.getVoidCount_USD()+" - \nTotalAmount_USD = "+this.getTotalAmount_USD()
        +" - \nTotalCount_USD = "+this.getTotalCount_USD()+" - \nRespMsg = "+this.getRespMsg();
    }
}
