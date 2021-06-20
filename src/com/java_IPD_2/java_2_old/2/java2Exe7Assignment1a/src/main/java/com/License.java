package _java_exe.java2Exe7Assignment1a.src.main.java.com;

public class License {
    private String licNum;
    
    // Constructor
    License(){}
    
    License(String inLicense){
    this.licNum = inLicense;
    }
    
    // Getter
    public String getLicense(){
        return licNum;
    }
    
    // setter
    public void setLicense(String inputLicense){
        this.licNum = inputLicense;
    }
         
}
