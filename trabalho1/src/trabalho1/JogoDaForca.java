package trabalho1;

import java.util.Random;
import java.util.Scanner;

public class JogoDaForca {
  static String [ ][ ] Tema = new String[51][51];
	 
		public static void main(String[] args) {
		   int op=0;
		   boolean ganhou =false;
	       int tentativas = 5;
	       char letra;
	       char opc;
	       int n=0;
	       String [ ][ ] Tema = {{"Fruta","abacate", "abacaxi","araça","azeitona","açaí", 
          		"acerola","ameixa","amora","abrico","anonácea", "abobora"},
		     
			{"Animais ","Cabra", "cabrito", "cacatua", "cachorro", "cágado", "calango"
		    , "cão","centopeia","cervo", "chinchila", "chita", "cigarra",
		   	 "cisne", "coala", "cobra", "codorna", "coelho", "coiote", "coral", "coruja"},
		   
		   {"Objetos","dado", "dardo", "dedal", "dentadura", "desentupidor", "desfibrilador",
		   "desodorante", "despertador", "detergente", "diadema", "diario", "dicionario",
			"difusor", "dinamite", "disco", "disquete","domino"},
		  
		   {" Nomes","amanda","fernanda","gabriela","jessica", "nicole","fabio"},
		   
	    	 {" Cor","amarelo","verde","vermelo","cinza","branco","rosa"}};

         
	       Random random= new Random(); 
		 
	            //Declarando e construindo o objeto 
		   Scanner ler = new Scanner(System.in); // Scanner
		  
			do { 
				    System.out.println("MENU ");
			        System.out.println();
			        System.out.println("1. Gerenciar Temas");
			        System.out.println("2. Gerenciar Palavras");
			        System.out.println("3. Jogar");
		            System.out.println("4. Sair");
		            System.out.println();
		            op = ler.nextInt();	          
		            switch (op) {
		            case 1:
		            	   
		            	System.out.println("1.Cadastro");
		            	   System.out.println("2.Exclusão");
		            	   System.out.println("3.Busca");
		            	   op = ler.nextInt();
		            	   if(op==1) {
		            		   
		            		   System.out.println("1.Cadastro");
		            		   for(int i=0; i<=50; i++) {
		            			   if(Tema[i][0] != null) {
		            			   System.out.println("Escreva o tema");
		            			   Tema[i][0] =ler.next();
		            			   System.out.println("Tema:" +Tema[i][0]);
		            	
		            			   System.out.println("Deseja acrescentar mais algum tema?\n Digite's' para sim 'n' para não");
		            			   opc = ler.next().charAt(0);
		            			   if(opc == 'n') {
		            				  System.out.println("Saindo...");
		            			   
		            		   break;
		            			   }  while(Tema[i][0] == null && i<51);
		            		   }
		            	   }
		            		   break;
		             } 
		            	   if(op==2) {
		            		   System.out.println("2.Exclusão");
		            		   for(int i=0; i<=50; i++) {
		            			   for(int j=0; j<=50; j++) {
		            			   System.out.println("Qual tema deseja excluir?"); 
		            			   Tema[i][j] =ler.next();
		            		       //opc = ler.next().charAt(0);
		            			   System.out.println(" " +Tema[i][0]);
		            			 
		            		    	if(Tema[i][j]==null) { 
		            		    		System.out.println("Tema excluido");
		            		    		break;
		            		    	}else {
		            		    		  System.out.println("Não foi possivel excluir o tema.");
		            		
		            		    	}
		            			   }	            		
		            		    }
		            	   }
		            	   if(op==3) {
		                 	   System.out.println("3.Busca");
		                 	  for(int i=0; i < Tema.length; i++){
		                          System.out.println("Tema " + i + ": " + Tema[i][0]);
		                      }
		                
		                      System.out.println("Qual Tema você quer buscar?");
		                      opc = ler.next().charAt(0);
		                 	   String Busca = ler.nextLine();
  
		                 	   boolean encontrou = false;
		                      for(int i=0; i <Tema.length; i++){
		                          String elemento =Tema[i][0];
		                          if (elemento.equalsIgnoreCase(Busca)){
		                              encontrou = true;
		                         
		                          }
		                      }
		                      if (encontrou == true){
		                          System.out.println("Encontrou");
		                          
		                      }else{
		                          System.out.println("Não encontrou");
		                          break; 
		                      }
		                  }
		             
		            	  
		           
		            case 2:
		            	  System.out.println("1.Cadastro");
		            	   System.out.println("2.Exclusão");
		            	   System.out.println("3.Busca");
		            	   System.out.println("4.Listagem");
		            	   op = ler.nextInt();
		            	   if(op==1) {
		            		   System.out.println("1.Cadastro");
		            		   int i=0;
		            		 // System.out.println("Escolha um Tema:"  +String.Tema[51][51]);
		            		   for( i=0; i < Tema.length; i++){
			                          
		            		  
		            		   System.out.println("Tema " + i + ": " + Tema[i][0]);
		            		   }
			                      System.out.println("Qual Tema você deseja?");
			                      
			                      opc = ler.next().charAt(0);
		            		   
		            		   for(int j=0; j<=50; j++) {
		            			   System.out.println("Escreva a palavra");
		            			   Tema[0][j] =ler.next();
		            			   System.out.println("Palavra:" +Tema[0][j]);
		            		  
		            			   System.out.println("Deseja acrescentar mais algum palavra?\n Digite's' para sim 'n' para não");
		            			   opc = ler.next().charAt(0);
		            			   if(opc == 'n') {
		            				  System.out.println("Saindo...");
		            			   
		            				  break;
		            		   }
		            	   }
		            		   
		            		   break;
		             }
		            	
		   	 
		            	   if(op==2) {
		            		   System.out.println("2.Exclusão");
		            		   for(int i=0; i<=50; i++) {
		            			   for(int j=0; j<=50; j++) {
		            			   System.out.println("Qual palavra deseja excluir?"); 
		            			   Tema[i][j] =ler.next();
		            		       //opc = ler.next().charAt(0);
		            			   System.out.println(" " +Tema[0][j]);
		            			 
		            		    	if(Tema[i][j]!=null) { 
		            		    		System.out.println("Palavra excluido");
		            		    	break;
		            		    	}else {
		            		    		  System.out.println("Não foi possivel excluir o tema.");
		            		break;
		            		    	}
		            			   }
		            			  
		            		    }
		            	   }
		            	   if(op==3) {
		            		   int j=1;
		            		   boolean encontrou = false;
		            		   System.out.println("3.Busca");
		            	 	   String Busca = ler.nextLine();
		            	 	    String elemento =Tema[0][j];
		            	 	   for( j=1; j <Tema.length; j++){
			                    	  System.out.println("Qual palavra você quer buscar?");
				                       opc = ler.next().charAt(0);
				                 	
		            	 	   
			                   for( j=1; j <Tema.length; j++){
			                    	 
			                          if (elemento.equalsIgnoreCase(Busca)){
			                              encontrou = true;
			                          }
			                          
			                        }
			                      if (encontrou == true){
			                          System.out.println("Palavra  encontrada");
			                          break;
			                      }else{
			                         System.out.println("Palavra não encontrada");
			                           
			                      
			                      }
			                  }
		            	   
		            	   }
		            	   
		            	   if(op==4) {
		            		   String Temas = ler.nextLine();
		                 	   System.out.println("3.Listagem");
		                 	  for(int i = 0; i < Tema[i].length; i++) {
		                 	
		                 		 System.out.println("Selecione um tema " + i + ": " + Tema[i][0]);

		                 		  for(int j = 1; j < Tema[j].length; j++) {
		                 			 System.out.println("Palavras do tema selecionado:"+Tema[0][j]);
		                 		 if(Tema[i][j] == null) 
		                 		System.out.println("vazio");
		                 			//  System.out.println("Palavras do tema selecionado:" + Tema[i][j]);
		                 		 break;
		                 		  }}while(Tema != null);
		                
		            
		            	  
		            	   } 
		            	  
		            	   
		            case 3:
		                   System.out.println("1.Seleção de tema");
		            	   System.out.println("2.Jogo");
		            	   
		            	   System.out.println("4.Sair");
		            	   op = ler.nextInt();
		            	   if(op==1 ) {
            				   
		            		   System.out.println("1.Seleção de tema");
		            		   for(int i = 0; i < Tema.length; i++) {
		                       Tema[i][0] =ler.next();
		                       System.out.printf("Possui %s temas com esse nome '%s' ",i+1, Tema[i][0]);
		                       System.out.printf("\nDeseja selecionar esse tema? Sim 's' e 'n' para não");
		                       opc = ler.next().charAt(0);
		                       if((opc == 's')) {
		                    	  ///continuar  
		                    	   
		                    	   
		                       }
		                       else {
	            				  System.out.println("Saindo...");
	            			   
	            		   break;
	            		   }
		                       
		                       break;
		            		   }
		            	   
                
		            	   }
		            	   if(op==2) {
		            		   System.out.println("2.Jogo");
		            		  
		                       String totalDeLetras =" ";
		                                           //Quantidade de Palavras 
		                       
		                       int i= Tema.length;// -> length diz qual é o tamanho exato do vetor

		                       int j= Tema.length;
		                       
		                      
		                      
		                                          //Indice Sorteado
		                   
		                       int indiceSorteado= random.nextInt(i);
		                       int palavraSorteada= random.nextInt(j);
		                       
		                       //System.out.println(Tema[indiceSorteado]); //  vê a palavra sorteada
		                       
		                       //Para não aparecer palavras iguais, deve se guardar a palavra que foi sorteada e depois verificar se ela =a prox.
		                     
		                     
		                       
		                                        // A palavra sorteada
		                       
		                       String sorteada = Tema [indiceSorteado][palavraSorteada];
		                       
		                       char[]correto = new char[sorteada.length()]; //correto é um vetor do msm tamanho do vetor sorteada 
		                       for( j = 0; j < sorteada.length(); j++) {
		                       	 System.out.print(" _ "); 
		                       }
		                       
		                       for (  j = 0 ; j <correto.length; j++) {
		                       	 correto [j]=0;	
		                       }
		                    
		                       
		                       // enquanto estiver acertando as letrar a pergunta ira se repetir *!-> não
		                       do {
		                       	
		                     // System.out.println(sorteada); //mostra a palavra sorteada
		                       System.out.println("\n" +"\nVocê tem "  + tentativas + " tentativas "
		                       +"\nLetras ultilizadas :" + totalDeLetras +
		                       "\nLetra:");
		                       
		                       letra = ler.next().charAt(0);
		                       totalDeLetras += " " +letra; //juntar as letras nas letras ultilizadas
		                     //  letraRepetida += "" +totalDeLetras;
		                     //  if(totalDeLetras == letraRepetida ) {
		                     //  	System.out.println("Tente outra letra!");
		                  //     }
		                       
		                       boolean errouTentativa = true;
		                       
		                       for(j  = 0; j < sorteada.length(); j++) {
		                       
		                       	//Verifica se a letra digitada é igual a palavra na posição i
		                       	
		                       if (letra==sorteada.charAt(j)){  
		                       	     //System.out.println("tem aessa letra na posição" +i); 
		                       	       correto[j] =1; //->faz a letra aparecer no "_"
		                       	       errouTentativa = false;
		                       }
		                      
		                     
		           	 }   
		                       if(errouTentativa) {
		                       	tentativas --;
		                       }
		                        ganhou =true;
		                            
		                            System.out.println("\n");
		                            
		                       	 for( j = 0; j < sorteada.length(); j++) {
		                       	
		                       	if (correto[j] == 0) {  // se o correto = 0 mostra o "_"
		                       	     System.out.print(" _ "); 
		                       		 ganhou = false;
		                       	}
		                       	 
		                       	else {
		                       		System.out.print(" " + sorteada.charAt(j) + ""); //caso contrario mostra-se a letra 
		                       
		                       	}
		                       
		           	        }       
		                       	// System.out.println("\n");
		                  }    while(!ganhou && tentativas >0) ; //se não ganhou e ainda tem vida  continua rodando
		                        if(tentativas!=0) {
		                       System.out.print("   Parabéns!! Você acertou a palavra! Deseja jogar novamente?");
		                   	 System.out.println("\nDigite'1' para sim '2' para não");
	            			   opc = ler.next().charAt(0);
		                        } else {
		                        	System.out.println("\n A palavra era:"+sorteada);
		                       	 System.out.print("\nVocê perdeu! Deseja Deseja jogar novamente?"); 
		                       	 System.out.println("\nDigite'1' para sim '2' para não");
		                        	n = ler.nextInt();
		                        	 System.out.println("1.Seleção de tema");
				            		   for(i = 0; i < Tema.length; i++) {
					                       Tema[i][0] =ler.next();
					                       System.out.printf("Possui %s temas com esse nome '%s' ",i+1, Tema[i][0]);
					                       System.out.printf("\nDeseja selecionar esse tema? Sim 's' e 'n' para não");
					                       opc = ler.next().charAt(0);
					                       if((opc == 's')) {
					                    	  ///continuar  
					                       }
					                       else {
				            				  System.out.println("Saindo...");
				            			   
				            		   break;
				            		   }
					                       
					                       break;
					            		   }
					            	   
			                
		                        	
		            			   if(n == 2) {
		            				  System.out.println("Saindo...");
		            			   
		            		   break;
		            			   }else{
		            				   return 	;
		            			   }
		                        }		
		           }
		            }
		            
		            	   
		            	 
		            	   if(op==4) {
		                 	   System.out.println("Encerrando o jogo :( ");
		            	  
		            	   }
			              
		            	   break;
		           
		            	 
		            		 
		           
		            } while(op!=4);
			 if(op>=5) {
				 System.out.println("Opção inválida");
			 }
			}}
		




