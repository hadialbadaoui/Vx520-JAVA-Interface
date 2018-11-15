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
public class Status {
    String message;

    public Status(JSONObject SOut) {
        try {
            this.message = SOut.getString("message");
        } catch (JSONException ex) {
        }
    }
    
    public String ShowStatus(){
        return this.message;
    }
}
