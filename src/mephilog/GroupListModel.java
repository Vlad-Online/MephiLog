/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mephilog;

import java.util.ArrayList;

/**
 *
 * @author vlad
 */
public class GroupListModel {
    Integer id;
    String title;
    ArrayList<StudentsListModel> students;
    
    public GroupListModel(Integer id, String title) {
        this.id = id;
        this.title = title;
    }
}
