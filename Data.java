import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;

public class Data{
    Scanner ler = new Scanner(System.in);

    int dia;
    int mes;
    int ano;
    

    public Data(int d, int m, int a){
        setAno(a);
        setMes(m);
        setDia(d);
    }
    
    public Data(){
            setAno();
            setMes();
            setDia();
    }

    public void setDia(int d){
        int numDay = 0;
        switch(mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numDay = 31;
                break;
            case 4: case 6: case 9: case 11:
                numDay = 30;
                break;
            case 2:
                if(bissexto() == true){numDay = 29;} 
                else { numDay = 28;}
                break;
            default:
                System.out.println("Erro, mês: " + mes + ", inválido.");
                setMes();
            break;
        }

        while(d > numDay){
            System.out.println("Dia incorreto. O mês escolhito tem " + numDay + " dias.");
            System.out.print("Por favor, tente novamente: ");
            d = ler.nextInt();
        }

        while(d <= 0){
            System.out.println("O dia começa no 1.");
            System.out.print("Por favor, tente novamente: ");
            d = ler.nextInt();
        }

        dia = d;
    }

    public void setMes(int m){
        while(m <= 0 || m > 12){
            System.out.println("Mês incorreto, o ano tem apenas 12 meses.");
            System.out.print("Tente novamente: ");
            m = ler.nextInt();
        }

        mes = m;
    }

    public void setAno(int a){
        while(a < 0){
            System.out.println("Ano começa a partir do 1.");
            System.out.print("Insira um ano correto: ");
            a = ler.nextInt();
        }
        ano = a;
    }


    // MÉTODOS SETTER SEM INPUT
    public void setAno(){
        System.out.print("Insira o ano: ");
        int a = ler.nextInt();
        setAno(a);
    }

    public void setMes(){
        System.out.print("Insira o mês: ");
        int m = ler.nextInt();
        setMes(m);
    }

    public void setDia(){
        System.out.print("Insira o dia: ");
        int d = ler.nextInt();
        setDia(d);
    }

    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAno(){
        return ano;
    }

    public String getMostra1(){
       
        String d;
        if(dia > 9){d = "" + dia;} 
        else{d = "0" + dia;}

        String m;
        if(mes > 9){m = "" + mes;}
        else{m = "0" + mes;}

        String a;
        if(ano > 999){a = "" + ano;}
        else if(ano > 99){a = "0" + ano;}
        else if(ano > 9){a = "00" + ano;}
        else{a = "000" + ano;}
 

        return (d + "/" + m + "/" + a);
    }

    public String getMostra2(){
        String m = "";
        switch (mes) {
        case 1: m = "Janeiro";
        break;
        case 2: m = "Fevereiro";
        break;
        case 3: m = "Março";
        break;
        case 4: m = "Abril";
        break;
        case 5: m = "Maio";
        break;
        case 6: m = "Junho";
        break;
        case 7: m = "Julho";
        break;
        case 8: m = "Agosto";
        break;
        case 9: m = "Setembro";
        break;
        case 10: m = "Outubro";
        break;
        case 11: m = "Novembro";
        break;
        case 12: m = "Dezembro";
        break;
        default:
        System.out.println("Mês inválido!!!");
        setMes();
        break;
        }

        String d;
        if(dia > 9){d = "" + dia;} 
        else{d = "0" + dia;}

        String a;
        if(ano > 999){a = "" + ano;}
        else if(ano > 99){a = "0" + ano;}
        else if(ano > 9){a = "00" + ano;}
        else{a = "000" + ano;}
 

        return (d + "/" + m + "/" + a);
    }
   
    public boolean bissexto(){
        boolean verifyAno;

        if(ano % 4 == 0){
            verifyAno = true;
        } 
        else{
            verifyAno = false;
        }

        return verifyAno;
    }

    public int getDiasTranscorridos(){
        int dias = 0;

        switch(mes){
            case 1:
                dias = dia;
                break;
            case 2:
                dias = 31 + dia;
                break;
            case 3:
                dias = (31 * 1 + 28) + dia;
                break;
            case 4: 
                dias = ((31 * 2) + 28) + dia;
                break;
            case 5:
                dias = ((31 * 2) + (30 * 1) + 28) + dia;
                break;
            case 6:
                dias = ((31 * 3) + (30 * 1) + 28) + dia;
                break;
            case 7:
                dias = ((31 * 3) + (30 * 2) + 28) + dia;
                break;
            case 8:
                dias = ((31 * 4) + (30 * 2) + 28) + dia;
                break;
            case 9:
                dias = ((31 * 5) + (30 * 2) + 28) + dia;
            case 10:
                dias = ((31 * 5) + (30 * 3) + 28) + dia;
                break;
            case 11:
                dias = ((31 * 6) + (30 * 3) + 28) + dia;
                break;
            case 12:
                dias = ((31 * 6) + (30 * 4) + 28) + dia;
                break;
            default:
                System.out.println("Mês inválido!");
                setMes();
                break;
        }

        if(bissexto()){dias++;}

        return dias;
    }

    public void apresentaDataAtual(){
        DateFormat ddata = DateFormat.getDateInstance(DateFormat.FULL);
        String str = ddata.format(new Date());
        System.out.println(str);
    }
}