/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockchain;

import java.util.Arrays;

/**
 *
 * @author AxelM
 */
public class Block {

    private int previousHash; //esta variable sera el Hash (firma digital) del bloque anterior
    private String[] transactions; //este vector de Strings seran nuestras transacciones que guardara el bloque

    private int blockHash; //esta variable sera el hash de este bloque

    public Block(int previousHash, String[] transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;

        Object[] contents = {Arrays.hashCode(this.transactions), this.previousHash}; //con este vector agrupamos el hash anterior y las transacciones de este bloque

        this.blockHash = Arrays.hashCode(contents); //de este modo si se cambia un valor del bloque, ya sea contenido o el hash anterior, el hash de este bloque cambia.
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public String[] getTransactions() {
        return transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }

}
