import java.util.Scanner;

public class ConsultaAgendada {
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private static int quantidade = 0;
    private String nomeMedico;

    public ConsultaAgendada(){

        setData();
        setHora();
        setNomePaciente();
        setNomeMedico();
        quantidade++;
    }

    public ConsultaAgendada(int h, int mi, int s, int d, int me, int a, String p, String m){
         hora.setHor(h); 
         hora.setMin(mi);
         hora.setSeg(s);
         data.setDia(d);
         data.setMes(me);
         data.setAno(a);
         setNomePaciente(p);
         setNomeMedico(m);
         quantidade++;
        
    }
    //arrumar
    public ConsultaAgendada(Data d, Hora h, String p, String m){
        this.data = d;
        this.hora = h;
        setNomePaciente(p);
        setNomeMedico(m);
        quantidade++;
    }

    public void setData(int a, int b, int c){
        data.setDia(a);
        data.setMes(b);
        data.setAno(c);
    }

    public void setData(){

        System.out.println("Por favor, marque uma data");
        data.setDia();
        data.setMes();
        data.setAno();
    }

    public void setHora(int a, int b, int c){
        hora.setSeg(a);
        hora.setMin(b);
        hora.setHor(c);
    }

    public void setHora(){

        System.out.println("Por favor, marque uma hora");
        hora.setHor();
        hora.setMin();
        hora.setSeg();
    }

    public void setNomePaciente(String p){
        this.nomePaciente = p;

    }

    public void setNomePaciente(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Por favor, digite o nome do paciente:");
        String paciente = ler.nextLine();
        this.nomePaciente = paciente;

    }

    public void setNomeMedico(String m){
        this.nomeMedico = m;
    }

    public void setNomeMedico(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Por favor, digite o nome do médico:");
        String medico = ler.nextLine();

        this.nomeMedico = medico;
    }

    public String getAmostra(){
        
    }

    public String getData(){
        return data.Mostra1();
    }

    public String getHora(){
        return hora.getHora1();

    }

    public String getNomePaciente(){
        return this.nomePaciente;

    }

    public String getNomeMedico(){
        return this.nomeMedico;
    }


    
}
