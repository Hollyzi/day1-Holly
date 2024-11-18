package com.tw;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        String multiplicationTable = builder.generateMultiplicationTable(start, end);
        System.out.println(multiplicationTable);
    }

    public String generateMultiplicationTable(int start, int end) {
        String multiplicationTable="";

        return multiplicationTable;
    }
    public boolean checkValidation(int start,int end){
        boolean validation=checkIsSmallerThanEnd(start,end)&&checkIsRangeOfScope(start)&&checkIsRangeOfScope(end);
        return validation;
    }

    public boolean checkIsSmallerThanEnd(int start,int end){
        boolean isSmallerThanEnd=start<=end;
        return  isSmallerThanEnd;
    }
    public boolean checkIsRangeOfScope(int number){
        boolean isRangeOfScope=number>1&&number<=1000;
        return isRangeOfScope;
    }


    public String generateLine(int start,int end){
        String line="";
        for(int i=start;i<=end;i++){
            int result=i*end;
            if(i!=end){
                line=line+Integer.toString(i)+'*'+ Integer.toString(end)+'='+ Integer.toString(result)+" ";
            }else{
                line=line+Integer.toString(i)+'*'+ Integer.toString(end)+'='+ Integer.toString(result);
            }
        }
        return line;
    }







}
