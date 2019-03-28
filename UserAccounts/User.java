package coll.UserAccounts;

import java.util.ArrayList;

/**
 * Represents a user with a username and password.
 *
 * Maintains a record of existing usernames.
 *
 */
public class User {
    static ArrayList<String> usernames = new ArrayList<String>();

    private String username;
    private String password;

    /**
     * Constructs a user with a given username and password. If a user is
     * successfully constructed, their username is added to the list of usernames.
     *
     * @param username - the username.
     * @param password - the password.
     * @throws UserException if the username or password is invalid.
     */
    public User(String username, String password) throws UserException
    {
        if(badUsername(username) == true)
        {
            throw new UserException();
        }
        this.username = username;
        if(badPassword(password) == true)
        {
            throw new UserException();
        }
        this.password = password;
        usernames.add(username);
    }

    /**
     * Checks if a given username is invalid.
     *
     * @param username - the username
     * @return true iff the username already exist.
     */
    public static boolean badUsername(String username)
    {
        boolean results = false;
        if(usernames.contains(username))
        {
            results = true;
        }
        return results;
    }

    /**
     * Checks if a given password is invalid.
     *
     * @param password - the password
     * @return true iff the password is fewer than 8 characters long.
     */
    public static boolean badPassword(String password)
    {
        boolean results = false;
        if(password.length() < 8)
        {
            results = true;
        }
        return results;
    }

    /**
     * Gets the username of the user.
     *
     * @return the username.
     */
    public String getUsername()
    {
        return username;
    }

    /**
     * Gets the password of the user.
     *
     * @return the password
     */
    public String getPassword()
    {
        return password;
    }
}
