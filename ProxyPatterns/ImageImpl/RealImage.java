package ProxyPatterns.ImageImpl;


import ProxyPatterns.Image;

public class RealImage implements Image {

    private String fileName;


    public RealImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void displayImage() {
        System.out.println("보여주기: "+fileName);
    }
    private void lodFromDisk(String fileName){
        System.out.println("로딩: "+fileName);
    }




}
