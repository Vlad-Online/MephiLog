/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mephilog;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.prefs.Preferences;

/**
 *
 * @author vlad
 */
public class MephiLog {

    public static Preferences userPrefs;
    public static MephiDB db;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Properties prop = new Properties();
        userPrefs = Preferences.userRoot().node("prefexample");
        db = null;

        ConfigJFrame ConfigForm;
        String dbip = userPrefs.get("dbip", "127.0.0.1");
        String login = userPrefs.get("login", "admin");
        String password = userPrefs.get("password", "admin");

        ConfigForm = new ConfigJFrame(dbip, login, password);
        ConfigForm.setVisible(true);

    }

}
