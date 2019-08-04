/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uz.ubtuit.se.medhistoryservice.history;

import javax.ws.rs.PathParam;

/**
 *
 * @author xursand
 */
public interface HistoryConInterface {
public String getAllHistory();
   public void saveHistory(History history);
   public void deleteHistory(int id);
   public void updateHistory(History history);
   public String gethistoryById(@PathParam("id") String id);
    
}
