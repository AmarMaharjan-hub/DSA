/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackAndQueue;

import java.util.Scanner;

/**
 *
 * @author riku
 */
public class InfixToPrefix {

    static String output="";
    static char stack1[]=new char[20];
    static int top=-1,topPro;
    
    static void stkPush(char value){
        top++;
        stack1[top]=value;
        topPro=priority(stack1[top]);
    }
    static char stkPop(){
        char retVal=stack1[top];
        top--;
        if(top==-1){
            topPro=0;
        }else{
            topPro=priority(stack1[top]);
        }
        return retVal;
    }
    
    static void readChar(String exp){
        char read;
        int inc=0;
        do{
            read=exp.charAt(inc);
            charCheck(read);
            inc++;
            
            
        }while(inc!=exp.length());
        do{
            if(top!=-1){
                char pop=stkPop();
                appendOutput(pop);
            }
        }while(top!=-1);
    }
    
    static void charCheck(char ch){
        if(ch>=65&&ch<=90){
            appendOutput(ch);
        }else if(ch==42||ch==43||ch==45||ch==47){
            opeCheck(ch);
        }else if(ch==40){
            stkPush(ch);
        }else if(ch==41){
            bktClose(ch);
        }
    }
    
    static void bktClose(char ch){
        do{
            char pop=stkPop();
            appendOutput(pop);
        }while(stack1[top]!=40);
        char temp=stkPop();
    }
    
    static void opeCheck(char ch){
        if(top==-1){
            stkPush(ch);
        }else{
            if(priority(ch)>=topPro){
                stkPush(ch);
            }else if(priority(ch)<topPro){
                do{
                    char pop=stkPop();
                    appendOutput(pop);
                    if(top==-1){
                        break;
                    }
                }while(priority(ch)<topPro);
                stkPush(ch);
            }
        }
    }
    
    static int priority(char ch){
        int pro;
        switch(ch){
            case '-':
                pro=2;
                break;
            case '+':
                pro=2;
                break;
            case '*':
                pro=3;
                break;
            case '/':
                pro=3;
                break;
            case '(':
                pro=1;
                break;
            default:
                pro=0;
        }
        return pro;
    }
    static void appendOutput(char value){
        output=output+value;
    }
    
    static String strRev(String str){
        int length=str.length();
	        String rev="";
	        for(int i=length-1;i>=0;i--){
			char ch=str.charAt(i);
			if(ch==40){
				ch++;
			}else if(ch==41){
				ch--;
			}
	        	rev=rev+ch;
	        }
        	return rev;
    }
    
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String infix;
        System.out.print("Enter a infix string(in uppercase): ");
        infix=scan.next();
        String rev=strRev(infix);
        readChar(rev);
        String fnlOutput=strRev(output);
        System.out.println("\nPostfix conversion:\n"+fnlOutput);
    }
}