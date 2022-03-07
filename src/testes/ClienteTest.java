package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import codigos.Cliente;

	class ClienteTest {

		@Test
		void testeComprovar_endereco1() {
			Cliente cliente = new Cliente("João Carlos Meneguel","15836985542", "35988956895","35988956895","875458856", "001", "1234", "joaocarlos@gmail.com", "Rua:João Anacleto Moraes,bairro:Jardim América", 19, 02, 2005, 1200, true, 2000);
			boolean resultado = cliente.comprovar_endereco("Rua: Américo Leão, bairro:Jardim América");
			boolean esperado = false;
			assertTrue(resultado==esperado);
			
		}
		
		@Test
		void testeComprovar_endereco2() {
			Cliente cliente = new Cliente("Luiz Roberto Santos","25714835825", "35987458522","35987458522","545878652", "002", "4321", "luizrosan@gmail.com", "Rua:João Barbosa Silveira,bairro:Centro", 27, 12, 2010, 2200, true, 5000);
			boolean resultado = cliente.comprovar_endereco("Rua:João Barbosa Silveira,bairro:Centro");
			boolean esperado = true;
			assertTrue(resultado==esperado);
			
		}
		
		@Test
		void testeComprovar_endereco3() {
			Cliente cliente = new Cliente("Gabriel Roberto Almeida","65895475865", "35996589875","35996589875","258987213", "014", "8457", "bartsimpson@gmail.com", "Rua:Afonso Pena,bairro:Centro", 01, 05, 2015, 6400, true, 20000);
			boolean resultado = cliente.comprovar_endereco("Rua: Joaquim Almeida, bairro:São Luiz");
			boolean esperado = false;
			assertTrue(resultado==esperado);
			
		}
		
		@Test
		void testeComprovar_endereco4() {
			Cliente cliente = new Cliente("Jéssica Roberta dos Santos","98754632125", "37997154879","37997154879","896556563", "152", "6987", "jehrosantos@gmail.com", "Rua:João Vicente Silveira,bairro:Jardim Industrial", 29, 11, 2016, 800, true, 500);
			boolean resultado = cliente.comprovar_endereco("Rua:João Vicente Silveira,bairro:Jardim Industrial");
			boolean esperado = true;
			assertTrue(resultado==esperado);
			
		}
			
		@Test
		void testeComprovar_endereco5() {
			Cliente cliente = new Cliente("Sarah Fernandes de Lima","68459721354", "32998562415","32998562415","548524856", "587", "6578", "sarahfelim@gmail.com", "Rua:Maria Cecilia,bairro:Vila São Jorge", 04, 01, 2010, 5400, true, 10000);
			boolean resultado = cliente.comprovar_endereco("Rua:Maria Cecilia,bairro:Vila São Jorge");
			boolean esperado = true;
			assertTrue(resultado==esperado);
			
		}
		
		
		
		
		
		
		
		
		@Test
		void testCalcular_teto1() {
			Cliente sistemabancario = new Cliente("João Fernandes Campos","98457821458", "35991256558","35991256558","854569542", "475", "5874", "johfercamp@gmail.com", "Rua:Carlos Moreira da Silva,bairro:Jardim Ásia", 25, 07, 2005, 1400, true, 3650);
			double resultado = sistemabancario.calcular_teto(2022,10);
			double esperado = 20000;
			assertTrue(resultado==esperado);
		
}
	
		@Test
		void testCalcular_teto2() {
			Cliente sistemabancario = new Cliente("Fernando Silva Barbosa","7589684512359", "35997584556","35997584556","587523658", "854", "8548", "nandinsilvabb@gmail.com", "Rua:José Américo, Bairro: Vila São Jorge", 12, 05, 2002, 800, true, 1570);
			double resultado = sistemabancario.calcular_teto( 2022, 9);
			double esperado = 12500;
			assertTrue(resultado==esperado);
			
	}
	
		@Test
		void testCalcular_teto3() {
			Cliente sistemabancario = new Cliente("Ana Clara Sampaio","25874136965", "35997856545","35997856545","369874532", "254", "4752", "anaclarasa@gmail.com", "Rua:João Vicente Constantino,bairro:Vila Camacho", 22, 12, 2021, 1400, true, 6500);
			double resultado = sistemabancario.calcular_teto( 2022, 12);
			double esperado = 800;
			assertTrue(resultado==esperado);
			
	}
	
	@Test
		void testCalcular_teto4() {
		Cliente sistemabancario = new Cliente("Amanda Nogueira dos Santos","957845685212", "35996321485","35996321485","696321478", "005", "1454", "amandanogsan@gmail.com", "Rua:Maria de Lourdes,bairro:Silveiras", 05, 12, 2021, 1100, true, 2200);
		double resultado = sistemabancario.calcular_teto( 2022, 5);
		double esperado = 0;
		assertTrue(resultado==esperado);
			
	}
	
	@Test
	void testCalcular_teto5() {
		Cliente sistemabancario = new Cliente("Joaquim Roberto Barbosa","25896374125", "35988457568","35988457568","254856845", "007", "9874", "joaquimrohbah@gmail.com", "Rua:Arthur Bernardes,bairro:Centro", 11, 05, 2019, 1740, true, 5540);
		double resultado = sistemabancario.calcular_teto( 2022, 4);
		double esperado = 3500;
		assertTrue(resultado==esperado);
			
	}
	
		
	
		
		
		
		
		
		@Test
		void testeAprovar_emprestimo1() {
			Cliente sistemabancario = new Cliente("Ana Maria Silva","145852698754", "35988785621","anamahsilva@gmail.com","145852545", "145", "4752", "anamahsilva@gmail.com", "Rua:João Fernandes ,bairro:Jardim da Acácias", 21, 05, 2021, 1100, true, 600);
			boolean resultado = sistemabancario.aprovar_emprestimo(150, 2022, 05);
			boolean esperado = true;
			assertTrue(resultado==esperado);
			
		}
		
		@Test
		void testeAprovar_emprestimo2() {
			Cliente sistemabancario = new Cliente("João Avelino Botelho","25436585695", "joaoavelinobotelho@gmail.com","35995269548","145845865", "004", "8547", "joaoavelinobotelho@gmail.com", "Rua:Benedito Ferrari,bairro:Alto das Mercês", 25, 05, 2019, 1000, true, 900);
			boolean resultado = sistemabancario.aprovar_emprestimo(900, 2022, 07);
			boolean esperado = true;
			assertTrue(resultado==esperado);
			
		}
		
		@Test
		void testeAprovar_emprestimo3() {
			Cliente sistemabancario = new Cliente("Sarah Ellen Silveira","15235695481", "35987569584","sarahellensilv@gmail.com","458254156", "019", "5841", "sarahellensilv@gmail.com", "Rua:Deodoro da Fonseca,bairro:Centro", 04, 05, 2015, 1740, true, 20000);
			boolean resultado = sistemabancario.aprovar_emprestimo(35000,2022,05);
			boolean esperado = false;
			assertTrue(resultado==esperado);
			
		}
		
		@Test
		void testeAprovar_emprestimo4() {
			Cliente sistemabancario = new Cliente("Roberta Maria Mesquita","58123574595", "35988451254","robertamariamesquita@gmail.com","854874589", "452", "4751", "robertamariamesquita@gmail.com", "Rua:João Barbosa Silveira,bairro:Centro", 30, 10, 2017, 2500, true, 15000);
			boolean resultado = sistemabancario.aprovar_emprestimo(14000,2022,10);
			boolean esperado = true;
			assertTrue(resultado==esperado);
			
		}
		
		@Test
		void testeAprovar_emprestimo5() {
			Cliente sistemabancario = new Cliente("Luiz Otávio Pontes","14596532154", "35997458526","luizotaviopontes@gmail.com","584258639", "102", "5842", "luizotaviopontes@gmail.com", "Rua:João Anacleto Moraes,bairro:Jardim América", 26, 05, 2022, 900, true, 600);
			boolean resultado = sistemabancario.aprovar_emprestimo(700,2022,07);
			boolean esperado = false;
			assertTrue(resultado==esperado);
			
		}
		
		
		
		
		
		

		
		@Test
		void testSacar1() {
			Cliente sistemabancario = new Cliente("Luiz Nogueira Silva","14525896354", "35998547412","luiznogsilva@gmail.com","458652325", "105", "4512", "luiznogsilva@gmail.com", "Rua:Afonso Pena,bairro:Centro", 22, 07, 2021, 1250, true, 10);
		double resultado = sistemabancario.sacar(5);
		double esperado = 5;
		assertTrue(resultado==esperado);
							
	}	
		
		@Test
		void testSacar2() {
		Cliente sistemabancario = new Cliente("Ana Beatriz Fonseca","12345678985", "35997123456","anabeafonseca@gmail.com","254865958", "150", "4851", "anabeafonseca@gmail.com", "Rua:Maria Cecilia,bairro:Vila São Jorge", 17, 11, 2019, 1500, true, 50000);
		double resultado = sistemabancario.sacar(25000);
		double esperado = 25000;
		assertTrue(resultado==esperado);
							
	}	
		
		@Test
		void testSacar3() {
		Cliente sistemabancario = new Cliente("Ana Luiza dos Santos","25486523147", "35996154785","analuizasantos@gmail.com","12598535625", "198", "1457", "analuizasantos@gmail.com", "Rua:João Vicente Constantino,bairro:Vila Camacho", 04, 02, 2015, 2790, true, 900);
		double resultado = sistemabancario.sacar(600);
		double esperado = 300;
		assertTrue(resultado==esperado);
							
	}	
		
		@Test
		void testSacar4() {
		Cliente sistemabancario = new Cliente("Karine Fernandes da Silva","45985412356", "35988457469","karinefernandessilva@gmail.com","154856956", "152", "4512", "karinefernandessilva@gmail.com", "Rua:João Anacleto Moraes,bairro:Jardim América", 14, 01, 2017, 1200, true, 750);
		double resultado = sistemabancario.sacar(50);
		double esperado = 700;
		assertTrue(resultado==esperado);
							
	}	
		
		@Test
		void testSacar5() {
		Cliente sistemabancario = new Cliente("Maria Eduarda Rodarte","25485125695", "35997457458","dudarodarte@gmail.com","154856584", "145", "4512", "dudarodarte@gmail.com", "Rua:João Barbosa Silveira,bairro:Centro", 29, 12, 2018, 1300, true, 550);
		double resultado = sistemabancario.sacar(200);
		double esperado = 350;
		assertTrue(resultado==esperado);
							
	}	
		
		
		
		
		
		
		
		
		@Test
		void testDepostiar1() {
		Cliente sistemabancario = new Cliente("João Carlos Meneguel","15836985542", "35988956895","35988956895","875458856", "001", "1234", "joaocarlos@gmail.com", "Rua:João Anacleto Moraes,bairro:Jardim América", 19, 02, 2005, 1200, true, 550);
		double resultado = sistemabancario.depositar(200);
		double esperado = 750;
		assertTrue(resultado==esperado);
							
	}
		
		@Test
		void testDepostiar2() {
		Cliente sistemabancario = new Cliente("Jéssica Roberta dos Santos","98754632125", "37997154879","37997154879","896556563", "152", "6987", "jehrosantos@gmail.com", "Rua:João Vicente Silveira,bairro:Jardim Industrial", 29, 11, 2016, 800, true, 300);
		double resultado = sistemabancario.depositar(700);
		double esperado = 1000;
		assertTrue(resultado==esperado);
							
	}	
	
		@Test
		void testDepostiar3() {
		Cliente sistemabancario = new Cliente("Amanda Nogueira dos Santos","957845685212", "35996321485","35996321485","696321478", "005", "1454", "amandanogsan@gmail.com", "Rua:Maria de Lourdes,bairro:Silveiras", 05, 12, 2021, 1100, true, 200);
		double resultado = sistemabancario.depositar(200);
		double esperado = 400;
		assertTrue(resultado==esperado);
							
	}	
		@Test
		void testDepostiar4() {
		Cliente sistemabancario = new Cliente("Fernando Silva Barbosa","7589684512359", "35997584556","35997584556","587523658", "854", "8548", "nandinsilvabb@gmail.com", "Rua:José Américo, Bairro: Vila São Jorge", 12, 05, 2002, 800, true, 1000);
		double resultado = sistemabancario.depositar(200);
		double esperado = 1200;
		assertTrue(resultado==esperado);
							
	}	
		@Test
		void testDepostiar5() {
		Cliente sistemabancario = new Cliente("Ana Clara Sampaio","25874136965", "35997856545","35997856545","369874532", "254", "4752", "anaclarasa@gmail.com", "Rua:João Vicente Constantino,bairro:Vila Camacho", 22, 12, 2021, 1400, true, 350);
		double resultado = sistemabancario.depositar(350);
		double esperado = 700;
		assertTrue(resultado==esperado);
							
	}	
}
