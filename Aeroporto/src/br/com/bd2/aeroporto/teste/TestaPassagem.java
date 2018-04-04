package br.com.bd2.aeroporto.teste;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.bd2.aeroporto.modelo.Aeronave;
import br.com.bd2.aeroporto.modelo.Cliente;
import br.com.bd2.aeroporto.modelo.Passagem;
import br.com.bd2.aeroporto.modelo.Piloto;
import br.com.bd2.aeroporto.modelo.Voo;
import br.com.bd2.aeroporto.util.JPAUtil;

public class TestaPassagem {

	public static void main(String[] args) {

		Piloto piloto = new Piloto();
		piloto.setNome("João Pedro");
		piloto.setEmail("joaoP@hotmail.com");
		piloto.setTelefone("(51) 999999999");
		piloto.setEndereco("Presidente Kennedy");
		piloto.setNumPassaporte("AB123456");
		piloto.setNumBreve(1234);
		piloto.setHorasVoo(200);
		piloto.setDataContratacao(Calendar.getInstance());

		Aeronave a1 = new Aeronave();
		a1.setPrefixo("ABC123");
		a1.setModelo("Boing");
		a1.setCapacidade(140);
		a1.setDatafabricacao(Calendar.getInstance());

		Aeronave a2 = new Aeronave();
		a2.setPrefixo("DEF456");
		a2.setModelo("Boing");
		a2.setCapacidade(160);
		a2.setDatafabricacao(Calendar.getInstance());

		Voo voo1 = new Voo();
		voo1.setOrigem("Rio Grande do Sul");
		voo1.setDestino("São Paulo");
		voo1.setDataHoraSaida(Calendar.getInstance());
		voo1.setDataHoraChegada(Calendar.getInstance());
		voo1.setPiloto(piloto);
		voo1.setAeronaves(Arrays.asList(a1, a2));

		Voo voo2 = new Voo();
		voo2.setOrigem("Rio Grande do Sul");
		voo2.setDestino("Rio de Janeiro");
		voo2.setDataHoraSaida(Calendar.getInstance());
		voo2.setDataHoraChegada(Calendar.getInstance());
		voo2.setPiloto(piloto);
		voo2.setAeronaves(Arrays.asList(a1));

		Cliente c1 = new Cliente();
		c1.setCpf("999999999-99");
		c1.setRg("9999999999");
		c1.setNome("Pedro");
		c1.setEndereco("José Manuel Leão");
		c1.setTelefone("(51) 999999999");
		c1.setTelFamiliar("(51) 999999998");

		Cliente c2 = new Cliente();
		c2.setCpf("888888888-88");
		c2.setRg("8888888888");
		c2.setNome("João");
		c2.setEndereco("José Manuel Tigre");
		c2.setTelefone("(51) 888888888");
		c2.setTelFamiliar("(51) 888888887");

		Cliente c3 = new Cliente();
		c3.setCpf("777777777-77");
		c3.setRg("7777777777");
		c3.setNome("José");
		c3.setEndereco("José Manuel Onça");
		c3.setTelefone("(51) 777777777");
		c3.setTelFamiliar("(51) 777777776");

		Passagem p1 = new Passagem();
		p1.setMeioPagamento("Cartão");
		p1.setFormaPagamento("3x");
		p1.setPoltrona(101);
		p1.setValor(new BigDecimal("200.0"));
		p1.setDataHoraCompra(Calendar.getInstance());
		p1.setVoo(voo1);
		p1.setCliente(c1);

		Passagem p2 = new Passagem();
		p2.setMeioPagamento("Dinheiro");
		p2.setFormaPagamento("1x");
		p2.setPoltrona(105);
		p2.setValor(new BigDecimal("98.0"));
		p2.setDataHoraCompra(Calendar.getInstance());
		p2.setVoo(voo2);
		p2.setCliente(c2);

		Passagem p3 = new Passagem();
		p3.setMeioPagamento("Cartão");
		p3.setFormaPagamento("6x");
		p3.setPoltrona(94);
		p3.setValor(new BigDecimal("230.0"));
		p3.setDataHoraCompra(Calendar.getInstance());
		p3.setVoo(voo1);
		p3.setCliente(c3);

		EntityManager em = new JPAUtil().getEntityManager();

		em.getTransaction().begin();
		em.persist(piloto);
		em.persist(a1);
		em.persist(a2);
		em.persist(voo1);
		em.persist(voo2);
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();

		em.close();

	}

}
