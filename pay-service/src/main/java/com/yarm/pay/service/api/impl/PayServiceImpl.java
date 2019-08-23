package com.yarm.pay.service.api.impl;

import com.yarm.pay.pojo.api.request.RequestQuery;
import com.yarm.pay.service.api.AbstractPayService;
import com.yarm.pay.service.api.PayService;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/**
 * Created with IDEA
 * author:Yarm.Yang
 * Date:2019/6/13
 * Time:21:04
 * Des:
 */
@Service
public class PayServiceImpl extends AbstractPayService implements PayService {
    @Override
    public void pay(RequestQuery requestQuery) {

    }

    public static void main(String args[]) {
        String test = "12345678902234567890-1Hg87f83q";
        String md5 = md5(test);
        System.out.println(md5);

//        char []upper = new char[26];
//        char []lower = new char[26];
////大写字母
//        for (int i=65; i<91;i++){
//            upper[i-65] = (char)i;
//        }
////小写字母
//        for (int i=97; i<123;i++){
//            lower[i-97] = (char)i;
//        }
//        System.out.println(lower);
//        String string = "abcdefghijklmnopqrstuvwxyz";
//        byte[] bytes = string.getBytes();
//        System.out.println(string.toCharArray());

    }

    public static String getMd5(String s){
//        char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        char hexDigits[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
//        char a[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        try {
            byte[] strTemp = s.getBytes();
            //使用MD5创建MessageDigest对象
            MessageDigest mdTemp = MessageDigest.getInstance("MD5");
            mdTemp.update(strTemp);
            byte[] md = mdTemp.digest();
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte b = md[i];
                //System.out.println((int)b);
                //将没个数(int)b进行双字节加密
                str[k++] = hexDigits[b >> 4 & 0xf];
                str[k++] = hexDigits[b & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            return null;
        }
    }

    public static void toMD5(String plainText) {
        try {
            //生成实现指定摘要算法的 MessageDigest 对象。
            MessageDigest md = MessageDigest.getInstance("MD5");
            //使用指定的字节数组更新摘要。
            md.update(plainText.getBytes());
            //通过执行诸如填充之类的最终操作完成哈希计算。
            byte b[] = md.digest();
            //生成具体的md5密码到buf数组
            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            System.out.println("32位: " + buf.toString());// 32位的加密
            System.out.println("16位: " + buf.toString().substring(8, 24));// 16位的加密，其实就是32位加密后的截取
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String md5(String txt) {
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(txt.getBytes("GBK"));    //问题主要出在这里，Java的字符串是unicode编码，不受源码文件的编码影响；而PHP的编码是和源码文件的编码一致，受源码编码影响。
            StringBuffer buf=new StringBuffer();
            for(byte b:md.digest()){
                buf.append(String.format("%02x", b&0xff));
            }
            return buf.toString();
        }catch( Exception e ){
            return null;
        }
    }
}