/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author testautomatisering
 */
public class TranslatorTest {
    
    public TranslatorTest() {
    }

    /**
     * Test of getNoun method, of class Translator.
     */
    @Test
    public void testGetNoun() {
        Translator instance = new Translator();
        assertEquals("noun[0] is not correct", "en lönehöjning", instance.getNoun(0));
    }

    /**
     * Test of getVerb method, of class Translator.
     */
    @Test
    public void testGetVerb() {
        Translator instance = new Translator();
        assertEquals("verb[0] is not correct", "springa", instance.getVerb(0));
    }

    /**
     * Test of getAdjective method, of class Translator.
     */
    @Test
    public void testGetAdjective() {
        Translator instance = new Translator();
        assertEquals("adjective[0] is not correct", "stor", instance.getAdjective(0));
    }
    
}
