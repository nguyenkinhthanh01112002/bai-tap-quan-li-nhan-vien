/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.time;

/**
 *
 * @author KINHTHANH
 */
public class Time 
{

    //khai bao 3 thuoc tinh gio,phut,giay
    private int hour;
    private int minute;
    private int second;
    public Time(int h,int m,int s)
    {
        //goi ham thiet lap gio,phut,giay
        setTime(h,m,s);
    }
    public void setTime(int h,int m,int s)
    {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    //Dinh nghia thiet lap h neu h>23 thiet lap lai 0
    public void setHour(int h)
    {
       this.hour = (h>=0&&h<24)?h:0;
    }
    public void setMinute(int m)
    {
        this.minute = (m>=0&&m<60)?m:0;
    }
    public void setSecond(int s)
    {
        this.second = (s>=0&&s<60)?s:0;
    }
    @Override
    public String toString()
    {
        return ((hour==12||hour==0)?12:hour%12)+":"+(minute<10?"0":"")+minute+":"+(second<10?"0":"")+second+(hour<12?"AM":"PM");
                
    }
    //tang giay len 1 donvi
    public void tick()
    {
        setSecond(second+1);
        //neu giay tang len 60 thi ham setSecond da thiet lap giay bang 0 do do can tang phut len 1
        if(second==0)
        {
            incrementMinute();
        }
    }
    public void incrementMinute()
    {
        setMinute(minute+1);
        if(minute==0)
        {
            incrementHour();
        }
    }
    public void incrementHour()
    {
        setHour(hour+1);
    }
    public static void main(String[] args) 
    {
        Time A = new Time(7,0,0);
        System.out.println("Thoi gian da thiet lap = "+A.toString());
        //tao vong lap vinh cuu
        while(true)
        {
            System.out.println(A.toString());
            try {
                //Dung 1 giay = 1000 mili giay, ham sleep phai goi trong khoi try...catch
                Thread.sleep(1000);
                //sau khi cho 1 s tang giay len 1 don vi
                A.tick();
            } catch (Exception e) {
            }
        }
    }
}
