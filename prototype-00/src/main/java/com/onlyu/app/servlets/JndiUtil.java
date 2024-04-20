package com.onlyu.app.servlets;

import javax.naming.InitialContext;

public class JndiUtil
{
    private static InitialContext ic = null;

    // Don't allow instantiation of this class.
    private JndiUtil()
    {
    }

    // Integer
    public synchronized static int getInt(String key)
    {
        return getInt(key, 0);
    }

    public synchronized static int getInt(String key, int defaultValue)
    {
        try
        {
            if (ic == null) ic = new InitialContext();
            return (Integer) ic.lookup("java:comp/env/" + key);
        } catch (Exception e)
        {
            return defaultValue;
        }
    }

    // String
    public synchronized static String getString(String key)
    {
        return getString(key, "");
    }

    public synchronized static String getString(String key, String defaultValue)
    {
        try
        {
            if (ic == null) ic = new InitialContext();
            return (String) ic.lookup("java:comp/env/" + key);
        } catch (Exception e)
        {
            return defaultValue;
        }
    }

    // Boolean
    public synchronized static boolean getBoolean(String key)
    {
        return getBoolean(key, false);
    }

    public synchronized static boolean getBoolean(String key, boolean defaultValue)
    {
        try
        {
            if (ic == null) ic = new InitialContext();
            return (Boolean) ic.lookup("java:comp/env/" + key);
        } catch (Exception e)
        {
            return defaultValue;
        }
    }
}