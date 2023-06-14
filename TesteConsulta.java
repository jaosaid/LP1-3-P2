public class TesteConsulta {
    public static void main(String[] args) {
        ConsultaAgendada p1 = new ConsultaAgendada(13, 30, 0, 7, 10, 2022, "Larissa Silva", "Dr. Roberto");

        System.out.println("P1:");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Nome do Médico: " + p1.getNomeMedico());
        System.out.println("Nome do Paciente: " + p1.getNomePaciente());
        System.out.println("Consulta número: " + p1.getQuantidade());

         ConsultaAgendada p2 = new ConsultaAgendada(12, 15, 0, 02, 2, 2022, "Jonas Santos", "Dr. Luiz");


        System.out.println("\nP2:");
        System.out.println("Data: " + p2.getData());
        System.out.println("Hora: " + p2.getHora());
        System.out.println("Nome do Médico: " + p2.getNomeMedico());
        System.out.println("Nome do Paciente: " + p2.getNomePaciente());
        System.out.println("Consulta número: " + p2.getQuantidade());

        p1.setData(05, 3, 2023);
        p1.setHora(16, 30, 0);
        p1.setNomePaciente("Crista Souza");
        p1.setNomeMedico("Dra. Lucia");

        System.out.println("\nPropriedades de p1 alterada:");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Nome do Médico: " + p1.getNomeMedico());
        System.out.println("Nome do Paciente: " + p1.getNomePaciente()); 
        System.out.println("Consulta número: " + p1.getQuantidade());
    }
}