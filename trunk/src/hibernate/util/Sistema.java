package hibernate.util;
import hibernate.util.HibernateUtil;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Controles.ControladorFuncionario;
import Controles.ControladorPessoa;

import negocio.basica.Clientef;
import negocio.basica.Clientej;
import negocio.basica.Fornecedor;
import negocio.basica.Funcionario;
import negocio.basica.Pessoa;

public class Sistema {

	public static void main(String[] args) throws ParseException {
		int opcao = 1;
		int opcaoCadastro = 1;
		Scanner leitor = new Scanner(System.in);
		
		Funcionario f = null;
		Pessoa p = null;
		ControladorFuncionario Controlf = null;
		ControladorPessoa Controlp = null;
		
		do {

			System.out.println("===============================");
			System.out.println("Sistema de alguma coisa");
			System.out.println("===============================");
			System.out.println("1 - Cadastro de Funcionario");
			System.out.println("2 - Cadastro de Clientes");
			System.out.println("3 - Cadastro de Fornecedores");
			System.out.println("0 - Sair");
			System.out.println("Opção: ");
			opcao = leitor.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Iniciando Cadastro de Funcionários");
				System.out.println("1 - Inclusao de Funcionario");
				System.out.println("2 - Alteracao de Funcionario");
				System.out.println("3 - Listagem de Funcionario");
				System.out.println("4 - Exclusao de Funcionario");
				System.out.println("Opção: ");
				opcaoCadastro = leitor.nextInt();
				switch (opcaoCadastro) {
				case 1:
					System.out.println("Iniciando a Inclusao de Funcionario");
					
					
					System.out.println("Código : ");
					int codigo = leitor.nextInt();
					leitor = new Scanner(System.in);
					
					System.out.println("Matricula : ");
					String mat = leitor.nextLine();

					System.out.println("Login : ");
					String log = leitor.nextLine();
					
					System.out.println("senha : ");
					String senha = leitor.nextLine();
					
					System.out.println("Nome : ");
					String nome = leitor.nextLine();
					
					System.out.println("Cpf : ");
					String cpf = leitor.nextLine();
					
					System.out.println("R.G. : ");
					String rg = leitor.nextLine();
					
					System.out.println("Data Nascimento : ");
					String datanasc = leitor.nextLine();    //new Date();
					
				    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");    
				    Date dnasc = df.parse(datanasc);
					
					System.out.println("Endereço : ");
					String end = leitor.nextLine();
					
					System.out.println("Número : ");
					String num = leitor.nextLine();
					
					System.out.println("Complemento : ");
					String compl = leitor.nextLine();
					
					System.out.println("Bairro : ");
					String bairro = leitor.nextLine();
					
					System.out.println("Cidade : ");
					String cidade = leitor.nextLine();
					
					System.out.println("CEP : ");
					String cep = leitor.nextLine();
					
					System.out.println("Estado : ");
					String uf = leitor.nextLine();
					
					System.out.println("Telefone : ");
					
					String tel = leitor.nextLine();
					
					System.out.println("e-mail : ");
					String email = leitor.nextLine();
					
					Date dcad = new Date();
					
					System.out.println("Grupo : ");
					String grupo = leitor.nextLine();
							
					f = new Funcionario();
					f.setCpf(cpf);
					f.setDatanasc(dnasc);
					f.setLogin(log);
					f.setMatricula(mat);
					f.setRg(rg);
					f.setSenha(senha);
					f.setNome(nome);
					f.setCodPessoa(codigo);
					
					p = new Pessoa();
					p.setCodPessoa(codigo);
		            p.setEndereco(end);
		            p.setNumero(num);
		            p.setComplemento(compl);
		            p.setBairro(bairro);
		            p.setCidade(cidade);
		            p.setCep(cep);
		            p.setUf(uf);
		            p.setTelefone1(tel);
		            p.setEmail(email);
		            p.setDatacad(dcad);
		            p.setGrupo(grupo);
					f.setPessoa(p);

					Controlp = new ControladorPessoa();
					Controlp.Incluir(p);
					
					Controlf = new ControladorFuncionario();
					Controlf.Incluir(f);
					
					break;
				case 2:
					System.out.println("Iniciando a alteracao de Funcionários");

					leitor = new Scanner(System.in);
					System.out.println("Digite o Código do Funcionário que será alterado ? ");
					int codigoa = leitor.nextInt();
					
					Funcionario f3 = new Funcionario();
					Pessoa p3 = new Pessoa();
					
					leitor = new Scanner(System.in);
										
					System.out.println("Matricula : ");
					String mat_a = leitor.nextLine();

					System.out.println("Login : ");
					String log_a = leitor.nextLine();
					
					System.out.println("senha : ");
					String senha_a = leitor.nextLine();
					
					System.out.println("Nome : ");
					String nome_a = leitor.nextLine();
					
					System.out.println("Cpf : ");
					String cpf_a = leitor.nextLine();
					
					System.out.println("R.G. : ");
					String rg_a = leitor.nextLine();
					
					System.out.println("Data Nascimento : ");
					String datanasc_a = leitor.nextLine();    //new Date();
					
				    DateFormat df_a = new SimpleDateFormat("dd/MM/yyyy");    
				    Date dnasc_a = df_a.parse(datanasc_a);
					
					System.out.println("Endereço : ");
					String end_a = leitor.nextLine();
					
					System.out.println("Número : ");
					String num_a = leitor.nextLine();
					
					System.out.println("Complemento : ");
					String compl_a = leitor.nextLine();
					
					System.out.println("Bairro : ");
					String bairro_a = leitor.nextLine();
					
					System.out.println("Cidade : ");
					String cidade_a = leitor.nextLine();
					
					System.out.println("CEP : ");
					String cep_a = leitor.nextLine();
					
					System.out.println("Estado : ");
					String uf_a = leitor.nextLine();
					
					System.out.println("Telefone : ");
					String tel_a = leitor.nextLine();
					
					System.out.println("e-mail : ");
					String email_a = leitor.nextLine();
					
					Date dcad_a = new Date();
					
					System.out.println("Grupo : ");
					String grupo_a = leitor.nextLine();
					
			    
					f3 = (Funcionario) HibernateUtil.getSession().get(Funcionario.class, codigoa);
					p3 = (Pessoa) HibernateUtil.getSession().get(Pessoa.class, codigoa);

					f3.setCpf(cpf_a);
					f3.setDatanasc(dnasc_a);
					f3.setLogin(log_a);
					f3.setMatricula(mat_a);
					f3.setRg(rg_a);
					f3.setSenha(senha_a);
					f3.setNome(nome_a);

		            p3.setEndereco(end_a);
		            p3.setNumero(num_a);
		            p3.setComplemento(compl_a);
		            p3.setBairro(bairro_a);
		            p3.setCidade(cidade_a);
		            p3.setCep(cep_a);
		            p3.setUf(uf_a);
		            p3.setTelefone1(tel_a);
		            p3.setEmail(email_a);
		            p3.setDatacad(dcad_a);
		            p3.setGrupo(grupo_a);
					
					ControladorPessoa ControlP3 = new ControladorPessoa();
		            ControlP3.Alterar(p3);
		            
					ControladorFuncionario ControlF3 = new ControladorFuncionario();
		            ControlF3.Alterar(f3);
		            
					//HibernateUtil.beginTransaction();
					//HibernateUtil.getSession().update(p3);
					//HibernateUtil.commitTransaction();
					
					break;
				case 3:
					
					System.out.println("Iniciando a listagem de Funcionários");
					
					HibernateUtil.beginTransaction();
					List<Funcionario> lista =  HibernateUtil.getSession().createCriteria(Funcionario.class).list();
					for (int i = 0; i<lista.size(); i++){
						Funcionario u1 =  lista.get(i);
						System.out.println(u1);
					}
					
					HibernateUtil.commitTransaction();

					break;
				case 4:
					System.out.println("Iniciando a exclusao de Funcionários");
				
					leitor = new Scanner(System.in);
					System.out.println("Digite o Código do Funcionário que será excluido ? ");
					int codigo1 = leitor.nextInt();
					
					
					Funcionario f2 = new Funcionario();
					f2 = (Funcionario) HibernateUtil.getSession().get(Funcionario.class, codigo1);
	                
					HibernateUtil.beginTransaction();
					HibernateUtil.getSession().delete(f2);
					HibernateUtil.commitTransaction();

					
					Pessoa p2 = new Pessoa();
					p2 = (Pessoa) HibernateUtil.getSession().get(Pessoa.class, codigo1);

					HibernateUtil.beginTransaction();
					HibernateUtil.getSession().delete(p2);
					HibernateUtil.commitTransaction();
					
					
					break;

				default:
					break;
				}
				break;
			case 2:
				System.out.println("Iniciando Cadastro de Clientes");
				System.out.println("1 - Inclusao de Clientes");
				System.out.println("2 - Alteracao de Clientes");
				System.out.println("3 - Listagem de Clientes");
				System.out.println("4 - Exclusao de Clientes");
				System.out.println("Opção: ");
				opcaoCadastro = leitor.nextInt();
				switch (opcaoCadastro) {
				case 1:
					Clientef cf = null;					
					Clientej cj = null;		
					
					System.out.println("Código do cliente : ");

					int cod_pessoa = leitor.nextInt();
					leitor = new Scanner(System.in);
					
					System.out.println("Nome : ");
					String nome = leitor.nextLine();
					
					System.out.println("cpf : ");
					String cpf = leitor.nextLine();

					System.out.println("rg : ");
					String rg = leitor.nextLine();

					System.out.println("Data Nascimento : ");
					String datanasc = leitor.nextLine();
					
				   	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");    
 					Date dnasc = df.parse(datanasc);

					System.out.println("cnpj : ");
					String cnpj = leitor.nextLine();
				
					System.out.println("Razao social : ");
					String rsocial = leitor.nextLine();


					System.out.println("Nome fantasia : ");
					String nfantasia = leitor.nextLine();


					System.out.println("ie : ");
					String ie = leitor.nextLine();
			
					System.out.println("Data de Abertura : ");
					String dataabertura = leitor.nextLine();
					
				   	DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");    
 					Date dabert = df.parse(dataabertura);

					cf = new Clientef();
					cf.setCodPessoa(cod_pessoa);
					cf.setNome(nome);
					cf.setCpf(cpf);
					cf.setRg(rg);
					cf.setDatanasc(dnasc);//   setDatanasc(dnasc);
					
					cj = new Clientej();
					cj.setCodPessoa(cod_pessoa);
					cj.setCnpj(cnpj);
					cj.setRazaosocial(rsocial);
					cj.setNomefantasia(nfantasia);
					cj.setIe(ie);
					cj.setDataabertura(dabert);					

					System.out.println("Endereço : ");
					String end = leitor.nextLine();
					
					System.out.println("Número : ");
					String num = leitor.nextLine();
					
					System.out.println("Complemento : ");
					String compl = leitor.nextLine();
					
					System.out.println("Bairro : ");
					String bairro = leitor.nextLine();
					
					System.out.println("Cidade : ");
					String cidade = leitor.nextLine();
					
					System.out.println("CEP : ");
					String cep = leitor.nextLine();
					
					System.out.println("Estado : ");
					String uf = leitor.nextLine();
					
					System.out.println("Telefone : ");
					String tel = leitor.nextLine();
					
					System.out.println("e-mail : ");
					String email = leitor.nextLine();
					
					Date dcad = new Date();
					
					System.out.println("Grupo : ");
					String grupo = leitor.nextLine();
					
					p = new Pessoa();
				
					p.setCodPessoa(cod_pessoa);
		           	p.setEndereco(end);
		      	    p.setNumero(num);
		            p.setComplemento(compl);
		            p.setBairro(bairro);
		            p.setCidade(cidade);
		            p.setCep(cep);
		            p.setUf(uf);
		            p.setTelefone1(tel);
		            p.setEmail(email);
		            p.setDatacad(dcad);
		            p.setGrupo(grupo);

					cf.setPessoa(p);
					cj.setPessoa(p);
					HibernateUtil.beginTransaction();
					HibernateUtil.getSession().save(p);
					HibernateUtil.getSession().save(cf);
					HibernateUtil.getSession().save(cj);
					HibernateUtil.commitTransaction();
					
					break;
				case 2:
					break;
				case 3:
					HibernateUtil.beginTransaction();
					List<Clientef> lista =  HibernateUtil.getSession().createCriteria(Clientef.class).list();
					for (int i = 0; i<lista.size(); i++){
						Clientef c1 =  lista.get(i);
						System.out.println(c1);
					}
					
					HibernateUtil.commitTransaction();
					
					HibernateUtil.beginTransaction();
					List<Clientej> lista1 =  HibernateUtil.getSession().createCriteria(Clientej.class).list();
					for (int i = 0; i<lista1.size(); i++){
				    	Clientej c1 =  lista1.get(i);
						System.out.println(c1);
					}
					
					HibernateUtil.commitTransaction();					
					break;
				case 4:
					leitor = new Scanner(System.in);
					System.out.println("Digite o Código do Cliente que será excluido: ");
					int cod_pessoa1 = leitor.nextInt();
								

					Clientef c2 = new Clientef();
					c2 = (Clientef) HibernateUtil.getSession().get(Clientef.class, cod_pessoa1);
	                
					HibernateUtil.beginTransaction();
					HibernateUtil.getSession().delete(c2);
					HibernateUtil.commitTransaction();

					Clientej c21 = new Clientej();
					c21 = (Clientej) HibernateUtil.getSession().get(Clientej.class, cod_pessoa1);
	                
					HibernateUtil.beginTransaction();
					HibernateUtil.getSession().delete(c21);
					HibernateUtil.commitTransaction();
					
					Pessoa p2 = new Pessoa();
					p2 = (Pessoa) HibernateUtil.getSession().get(Pessoa.class, cod_pessoa1);

					HibernateUtil.beginTransaction();
					HibernateUtil.getSession().delete(p2);
					HibernateUtil.commitTransaction();
					
					break;

				default:
					break;
				}
				break;
			case 3:

				System.out.println("Iniciando Cadastro de Fornecedor");
				System.out.println("1 - Inclusao de Fornecedor");
				System.out.println("2 - Alteracao de Fornecedor");
				System.out.println("3 - Listagem de Fornecedor");
				System.out.println("4 - Exclusao de Fornecedor");
				System.out.println("Opção: ");
				opcaoCadastro = leitor.nextInt();
				switch (opcaoCadastro) {
				case 1:
					System.out.println("Iniciando a Inclusao de Fornecedor");
										
					System.out.println("Código:");
					int codigo_f = leitor.nextInt();
					leitor = new Scanner(System.in);
					
					System.out.println("Razão Social:");
					String razsoc_f = leitor.nextLine();

					System.out.println("Nome Fantasia:");
					String nomfan_f = leitor.nextLine();
					
					System.out.println("CNPJ:");
					String cnpj_f = leitor.nextLine();
					
					System.out.println("Data Nascimento : ");
					String databe_f = leitor.nextLine();    		//new Date();

					System.out.println("ie : ");
					String ie_f = leitor.nextLine();
					
					
					DateFormat df_f = new SimpleDateFormat("dd/MM/yyyy");    
					Date databe_f1 = df_f.parse(databe_f);
						
					Fornecedor fn = new Fornecedor();
					fn.setCodPessoa(codigo_f);
					fn.setRazaosocial(razsoc_f);
					fn.setNomefantasia(nomfan_f);
					fn.setCnpj(cnpj_f);
					fn.setDataabertura(databe_f1);
					fn.setIe(ie_f);
					
					System.out.println("Endereço : ");
					String end_f = leitor.nextLine();
					
					System.out.println("Número : ");
					String num_f = leitor.nextLine();
					
					System.out.println("Complemento : ");
					String compl_f = leitor.nextLine();
					
					System.out.println("Bairro : ");
					String bairro_f = leitor.nextLine();
					
					System.out.println("Cidade : ");
					String cidade_f = leitor.nextLine();
					
					System.out.println("CEP : ");
					String cep_f = leitor.nextLine();
					
					System.out.println("Estado : ");
					String uf_f = leitor.nextLine();
					
					System.out.println("Telefone : ");
					String tel_f = leitor.nextLine();
					
					System.out.println("e-mail : ");
					String email_f = leitor.nextLine();
					
					Date dcad_f = new Date();
					
					System.out.println("Grupo:");
					String grupo_f = leitor.nextLine();
					
					
					Pessoa pf = new Pessoa();
				
					pf.setCodPessoa(codigo_f);
	           		pf.setEndereco(end_f);
	         		pf.setNumero(num_f);
	          		pf.setComplemento(compl_f);
	         	   	pf.setBairro(bairro_f);
	           	 	pf.setCidade(cidade_f);
	           	 	pf.setCep(cep_f);
            		pf.setUf(uf_f);
            		pf.setTelefone1(tel_f);
              	 	pf.setEmail(email_f);
	           		pf.setDatacad(dcad_f);
	           		pf.setGrupo(grupo_f);

					fn.setPessoa(pf);
					HibernateUtil.beginTransaction();
					HibernateUtil.getSession().save(pf);
					HibernateUtil.getSession().save(fn);
					HibernateUtil.commitTransaction();
				case 2:
				case 3:
				case 4:
					System.out.println("Iniciando a exclusao de Fornecedor");
				
					leitor = new Scanner(System.in);
					System.out.println("Digite o Código do Fornecedor que será excluido ?");
					int codigo1af = leitor.nextInt();
					
					
					Fornecedor fnae = new Fornecedor();
					fnae = (Fornecedor) HibernateUtil.getSession().get(Fornecedor.class, codigo1af);
	                
					HibernateUtil.beginTransaction();
					HibernateUtil.getSession().delete(fnae);
					HibernateUtil.commitTransaction();

			
					Pessoa p2 = new Pessoa();
					p2 = (Pessoa) HibernateUtil.getSession().get(Pessoa.class, codigo1af);

					HibernateUtil.beginTransaction();
					HibernateUtil.getSession().delete(p2);
					HibernateUtil.commitTransaction();
					
					
					break;

				default:
					break;
				}
			case 4:
				
			default:
				break;
			}
			
			
		} while (opcao!=0);
		
		
		
		
		
	}

	
	
	
}






