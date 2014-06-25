package org.codehard.contactorganizer;

/**
 * Created by User on 6/24/2014.
 */
public class Contact {

    private String _name, _phone, _email, _address;

    public Contact (String name, String phone, String email, String address) {
        this._name = name;
        this._phone = phone;
        this._email = email;
        this._address = address;
    }

    public  String getName() {
        return this._name;
    }

    public String getPhone() {
        return this._phone;
    }

    public String getEmail() {
        return this._email;
    }

    public  String getAddress() {
        return this._address;
    }
}
