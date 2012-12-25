package org.traccar.protocol;

import org.jboss.netty.buffer.ChannelBufferFactory;
import org.jboss.netty.buffer.HeapChannelBufferFactory;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class MeiligaoProtocolDecoderTest {

    @Test
    public void testDecode() throws Exception {

        MeiligaoProtocolDecoder decoder = new MeiligaoProtocolDecoder(new TestDataManager());
        ChannelBufferFactory factory = new HeapChannelBufferFactory();
        
        byte[] buf1 = {0x12,0x34,0x56,(byte)0xFF,(byte)0xFF,(byte)0xFF,(byte)0xFF,0x50,0x00,(byte)0x8B,(byte)0x9B,0x0D,0x0A};
        assertNull(decoder.decode(null, null, factory.getBuffer(buf1, 0, buf1.length)));

        byte[] buf2 = {0x12,0x34,0x56,(byte)0xFF,(byte)0xFF,(byte)0xFF,(byte)0xFF,(byte)0x99,0x55,0x30,0x33,0x35,0x36,0x34,0x34,0x2E,0x30,0x30,0x30,0x2C,0x41,0x2C,0x32,0x32,0x33,0x32,0x2E,0x36,0x30,0x38,0x33,0x2C,0x4E,0x2C,0x31,0x31,0x34,0x30,0x34,0x2E,0x38,0x31,0x33,0x37,0x2C,0x45,0x2C,0x30,0x2E,0x30,0x30,0x2C,0x2C,0x30,0x31,0x30,0x38,0x30,0x39,0x2C,0x2C,0x2A,0x31,0x43,0x7C,0x31,0x31,0x2E,0x35,0x7C,0x31,0x39,0x34,0x7C,0x30,0x30,0x30,0x30,0x7C,0x30,0x30,0x30,0x30,0x2C,0x30,0x30,0x30,0x30,0x69,0x62,0x0D,0x0A};
        assertNotNull(decoder.decode(null, null, factory.getBuffer(buf2, 0, buf2.length)));
        
        byte[] buf3 = {0x33,0x58,0x01,(byte)0x97,0x03,0x58,0x1F,(byte)0x99,0x55,0x31,0x33,0x34,0x33,0x35,0x31,0x2E,0x30,0x30,0x30,0x2C,0x41,0x2C,0x30,0x39,0x32,0x35,0x2E,0x35,0x30,0x32,0x35,0x2C,0x4E,0x2C,0x30,0x36,0x39,0x31,0x34,0x2E,0x38,0x31,0x30,0x37,0x2C,0x57,0x2C,0x30,0x2E,0x30,0x30,0x2C,0x32,0x33,0x2C,0x33,0x30,0x31,0x30,0x31,0x32,0x2C,0x2C,0x2A,0x32,0x43,0x7C,0x30,0x2E,0x38,0x7C,0x31,0x38,0x36,0x7C,0x32,0x30,0x30,0x30,0x7C,0x30,0x31,0x32,0x36,0x2C,0x30,0x30,0x46,0x46,0x7C,0x30,0x32,0x44,0x45,0x30,0x30,0x30,0x32,0x44,0x38,0x43,0x44,0x42,0x34,0x31,0x35,0x7C,0x30,0x36,0x7C,0x30,0x30,0x46,0x44,0x36,0x42,0x37,0x39,(byte)0x95,(byte)0x82,0x0D,0x0A};
        assertNotNull(decoder.decode(null, null, factory.getBuffer(buf3, 0, buf3.length)));

        byte[] buf4 = {0x16,(byte)0x91,0x00,0x04,(byte)0x84,0x12,0x4F,(byte)0x99,0x55,0x31,0x34,0x30,0x36,0x30,0x33,0x2E,0x30,0x30,0x30,0x2C,0x41,0x2C,0x30,0x39,0x33,0x34,0x2E,0x32,0x35,0x35,0x34,0x2C,0x4E,0x2C,0x30,0x36,0x39,0x31,0x33,0x2E,0x30,0x39,0x36,0x36,0x2C,0x57,0x2C,0x30,0x2E,0x30,0x30,0x2C,0x2C,0x33,0x30,0x31,0x30,0x31,0x32,0x2C,0x2C,0x2A,0x30,0x32,0x7C,0x30,0x2E,0x38,0x7C,0x32,0x30,0x37,0x7C,0x30,0x30,0x30,0x30,(byte)0xFA,0x42,0x0D,0x0A};
        assertNotNull(decoder.decode(null, null, factory.getBuffer(buf4, 0, buf4.length)));
        
        byte[] buf5 = {0x45,0x12,0x42,0x20,0x30,0x6F,(byte)0xFF,(byte)0x99,(byte)0x99,0x14,0x31,0x35,0x35,0x34,0x32,0x32,0x2E,0x30,0x30,0x30,0x2C,0x56,0x2C,0x32,0x32,0x33,0x30,0x2E,0x37,0x36,0x32,0x33,0x2C,0x4E,0x2C,0x31,0x31,0x34,0x30,0x33,0x2E,0x34,0x32,0x31,0x38,0x2C,0x45,0x2C,0x30,0x2E,0x30,0x30,0x2C,0x30,0x2C,0x30,0x36,0x30,0x32,0x31,0x31,0x2C,0x2C,0x2A,0x31,0x41,0x7C,0x30,0x2E,0x30,0x7C,0x32,0x36,0x7C,0x30,0x30,0x30,0x30,0x7C,0x30,0x30,0x30,0x30,0x2C,0x30,0x30,0x30,0x30,0x7C,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x7C,0x36,0x33,0x7C,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x30,(byte)0xBA,(byte)0xC1,0x0D,0x0A};
        assertNotNull(decoder.decode(null, null, factory.getBuffer(buf5, 0, buf5.length)));
        
        byte[] buf6 = {(byte)0x86,0x21,0x70,0x01,0x42,0x45,(byte)0x8F,(byte)0x99,(byte)0x99,0x50,0x31,0x39,0x32,0x39,0x35,0x38,0x2E,0x30,0x30,0x30,0x2C,0x41,0x2C,0x33,0x36,0x32,0x37,0x2E,0x31,0x36,0x39,0x39,0x2C,0x4E,0x2C,0x30,0x31,0x30,0x34,0x33,0x2E,0x35,0x36,0x32,0x37,0x2C,0x45,0x2C,0x30,0x2E,0x30,0x30,0x2C,0x32,0x33,0x39,0x2C,0x30,0x39,0x31,0x32,0x31,0x32,0x2C,0x2C,0x2A,0x30,0x46,0x7C,0x31,0x2E,0x30,0x7C,0x37,0x7C,0x30,0x30,0x30,0x30,0x7C,0x30,0x31,0x41,0x39,0x2C,0x30,0x31,0x39,0x37,0x7C,0x30,0x32,0x35,0x44,0x30,0x30,0x30,0x32,0x30,0x30,0x35,0x41,0x38,0x36,0x39,0x46,0x7C,0x31,0x32,0x7C,0x30,0x30,0x30,0x33,0x33,0x42,0x42,0x33,(byte)0xE2,0x48,0x0D,0x0A};
        assertNotNull(decoder.decode(null, null, factory.getBuffer(buf6, 0, buf6.length)));
        
        byte[] buf7 = {0x12,0x34,0x56,0x78,(byte)0x9F,(byte)0xFF,(byte)0xFF,(byte)0x99,0x55,0x30,0x32,0x30,0x36,0x30,0x30,0x2E,0x39,0x33,0x30,0x2C,0x41,0x2C,0x32,0x33,0x30,0x39,0x2E,0x32,0x30,0x35,0x31,0x2C,0x4E,0x2C,0x31,0x31,0x33,0x31,0x38,0x2E,0x38,0x34,0x34,0x39,0x2C,0x45,0x2C,0x30,0x2E,0x30,0x30,0x2C,0x30,0x2E,0x30,0x30,0x2C,0x30,0x39,0x30,0x37,0x31,0x30,0x2C,0x2C,0x2C,0x41,0x2A,0x36,0x41,0x7C,0x32,0x2E,0x36,0x7C,0x39,0x36,0x2E,0x37,0x7C,0x30,0x30,0x30,0x30,0x7C,0x30,0x30,0x30,0x30,0x2C,0x33,0x46,0x46,0x46,0x7C,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x30,(byte)0xC4,0x52,0x0D,0x0A};
        assertNotNull(decoder.decode(null, null, factory.getBuffer(buf7, 0, buf7.length)));

    }

}
