/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encryption;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/**
 *
 * @author SHA
 */
public class Enc_Dec {
    
    
    byte[]  input;
    byte[] keyByte="HotelManagmentSystem".getBytes();
    byte[] ivByte =" Group7".getBytes();
    
    SecretKeySpec key =new SecretKeySpec(keyByte,"DES");
    IvParameterSpec ivSpec = new IvParameterSpec(ivByte);
    
    Cipher cipher;
    byte[] ciphertext;
    int ctlength;

    public byte[] getInput() {
        return input;
    }

    public void setInput(byte[] input) {
        this.input = input;
    }

    public byte[] getKeyByte() {
        return keyByte;
    }

    public void setKeyByte(byte[] keyByte) {
        this.keyByte = keyByte;
    }

    public byte[] getIvByte() {
        return ivByte;
    }

    public void setIvByte(byte[] ivByte) {
        this.ivByte = ivByte;
    }

    public SecretKeySpec getKey() {
        return key;
    }

    public void setKey(SecretKeySpec key) {
        this.key = key;
    }

    public IvParameterSpec getIvSpec() {
        return ivSpec;
    }

    public void setIvSpec(IvParameterSpec ivSpec) {
        this.ivSpec = ivSpec;
    }

    public Cipher getCipher() {
        return cipher;
    }

    public void setCipher(Cipher cipher) {
        this.cipher = cipher;
    }

    public byte[] getCiphertext() {
        return ciphertext;
    }

    public void setCiphertext(byte[] ciphertext) {
        this.ciphertext = ciphertext;
    }

    public int getCtlength() {
        return ctlength;
    }

    public void setCtlength(int ctlength) {
        this.ctlength = ctlength;
    }
    
    
}
