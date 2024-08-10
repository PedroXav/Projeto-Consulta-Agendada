public class TestaConsultaAgendada {
    public static void main(String[] args) {
            
        
        ConsultaAgendada p1 = new ConsultaAgendada(8, 30, 0, 12, 3, 2024, "Luciana", "Dr. Gerônimo" );

        System.out.println("----------------------------------------------");
        System.out.println(" Agendamento de consulta do primeiro paciente ");
    
        System.out.println("Hora: " + " " + p1.getHora());
        System.out.println("Data: " + " " + p1.getData());
        System.out.println("Nome do Paciente: " + " " + p1.getNomePaciente());
        System.out.println("Nome do Médico: " + " " + p1.getNomeMedico());

        System.out.println("----------------------------------------------");

        System.out.println("Marque sua consulta:");

        ConsultaAgendada p2 = new ConsultaAgendada();
    
        System.out.println("----------------------------------------------");
        System.out.println("  Agendamento de consulta do segundo paciente ");

        System.out.println("Hora: " + " " + p2.getHora());
        System.out.println("Data: " + " " + p2.getData());
        System.out.println("Nome do Paciente: " + " " + p2.getNomePaciente());
        System.out.println("Nome do Médico: " + " " + p2.getNomeMedico());

        System.out.println("----------------------------------------------");

        System.out.println("Reagendamento de consulta do primeiro paciente");

        p1.setHora();
        p1.setData();
        p1.setNomePaciente();
        p1.setNomeMedico();

        System.out.println("----------------------------------------------");
    
        System.out.println("Data: " + " " + p1.getData());
        System.out.println("Hora: " + " " + p1.getHora());
        System.out.println("Nome do Paciente: " + " " + p1.getNomePaciente());
        System.out.println("Nome do Médico: " + " " + p1.getNomeMedico());

        System.out.println("----------------------------------------------");
    
        System.out.println("Quantidade Final de Consultas: " + p1.getAmostra());
            
    
    }
    
}
