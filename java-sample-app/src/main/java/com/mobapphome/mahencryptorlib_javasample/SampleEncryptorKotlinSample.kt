package com.mobapphome.mahencryptorlib_javasample

import com.mobapphome.mahencryptorlib.MAHEncryptor

/**
 * This is MAHEncryptorLib sample created test encryptor lib on non-Android java programs.
 * Created by Sattar Hummatli on 8/5/16.
 */
fun main(arg: Array<String>) {
    //Your key phrase mus be at least 18 character other through exeption
    val mahEncryptor = MAHEncryptor.newInstanceOrRetunNull("This is sample SecretKeyPhrase")

    val strForEncryption = "This is MAHEncryptorLib java sample"
    val encrypted = mahEncryptor!!.encodeOrReturnNull(strForEncryption)
    println("encrypted = " + encrypted)

    val decrypted = mahEncryptor.decodeOrReturnNull(encrypted)
    println("decrypted = " + decrypted)
}

