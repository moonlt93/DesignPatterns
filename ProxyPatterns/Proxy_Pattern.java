package ProxyPatterns;

import ProxyPatterns.ImageImpl.Proxy_Image;

public class Proxy_Pattern {
    public static void main(String[] args) {

        Image image1 = new Proxy_Image("testfile1");
        Image image2 = new Proxy_Image("testfile2");

        image1.displayImage();
        image2.displayImage();

    }
}
