package ProxyPatterns.ImageImpl;

import ProxyPatterns.Image;
import ProxyPatterns.Proxy_Pattern;

public class Proxy_Image implements Image {

    private String fileName;
    private RealImage realImage;

    public Proxy_Image(String fileName){
        this.fileName = fileName;
    }


    @Override
    public void displayImage() {
        if(realImage == null){
            this.realImage = new RealImage(fileName);
        }
        realImage.displayImage();
    }
}
