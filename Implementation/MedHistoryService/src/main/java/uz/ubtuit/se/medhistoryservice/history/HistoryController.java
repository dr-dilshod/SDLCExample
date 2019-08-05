/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uz.ubtuit.se.medhistoryservice.history;

import java.util.List;
import javax.ws.rs.PathParam;

/**
 *
 * @author xursand
 */
public interface HistoryController {
    public List<History> getAllHistory();
        public void addHistory(History history);
        public void deleteHistory(int id);
        public void updateHistory(History history);
        public String gethistoryById(int id);



}
