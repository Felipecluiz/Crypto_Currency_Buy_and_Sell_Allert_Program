import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
//import org.json.*;
//YJC40GEVI5PVOITX
public class Control {
    public static void main(String[] args) throws Exception {
        ArrayList <String> data = new ArrayList<String>();
        ArrayList <String> priceRS = new ArrayList<String>();
        ArrayList <String> priceUS = new ArrayList<String>();
        ArrayList <String> volume = new ArrayList<String>();
        ArrayList <String> capUS = new ArrayList<String>();

//        ArrayList <String> sMAETH40 = new ArrayList<String>();
//        ArrayList <String> sMAETH10 = new ArrayList<String>();
//        ArrayList <String> sMASC10 = new ArrayList<String>();
//        ArrayList <String> sMASC40 = new ArrayList<String>();
//        ArrayList <String> SCATR = new ArrayList<String>();
//        ArrayList <String> ETHATR = new ArrayList<String>();
//
//        ArrayList <String> sMAETH40date = new ArrayList<String>();
//        ArrayList <String> sMAETH10date = new ArrayList<String>();
//        ArrayList <String> sMASC10date = new ArrayList<String>();
//        ArrayList <String> sMASC40date = new ArrayList<String>();
//        ArrayList <String> SCATRdate = new ArrayList<String>();
//        ArrayList <String> ETHATRdate = new ArrayList<String>();
//        
//        
//        
        
        
//        URL ether = new URL("https://www.alphavantage.co/query?"
//                + "function=DIGITAL_CURRENCY_INTRADAY&symbol=ETH&market=BRL&apikey=YJC40GEVI5PVOITX&datatype=csv");
//        
//        
//        
//        URL mMovelETH40 = new URL("https://www.alphavantage.co/query?"
//                + "function=SMA&symbol=ETH&interval=1min&time_period=40&series_type=close&apikey=YJC40GEVI5PVOITX");
//        URL mMovelETH10 = new URL("https://www.alphavantage.co/query?"
//                + "function=SMA&symbol=ETH&interval=1min&time_period=10&series_type=close&apikey=YJC40GEVI5PVOITX");
//        URL mMovelETHATR = new URL("https://www.alphavantage.co/query?function=ATR&symbol=ETH&interval=30min&"
//        		+ "time_period=20&series_type=close&apikey=YJC40GEVI5PVOITX");
//        
//                
//        
//        
//        URL mMovelSC40 = new URL("https://www.alphavantage.co/query?"
//                + "function=SMA&symbol=SC&interval=1min&time_period=10&series_type=close&apikey=YJC40GEVI5PVOITX");
//        URL mMovelSC10 = new URL("https://www.alphavantage.co/query?"
//                + "function=SMA&symbol=SC&interval=1min&time_period=10&series_type=close&apikey=YJC40GEVI5PVOITX");
//                
//        URL mMovelSCATR = new URL("https://www.alphavantage.co/query?function=ATR&symbol=SC&interval=30min&"
//        		+ "time_period=20&series_type=close&apikey=YJC40GEVI5PVOITX");
//        
//        
        View callVi = new View();
        Calc use = new Calc();
        boolean stop=true;
        do {
        	
        switch(callVi.ini()) {	
        case 1:{  
        	Temp temp = new Temp(0);
        }
        case 0:{
        	stop=false;
        }
        }
    }while(stop);


    }
}//timestamp,price (BRL),price (USD),volume,market cap (USD)