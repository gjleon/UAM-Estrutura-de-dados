## UAM-Estrutura-de-dados
#Atividade 3
Implemente um projeto no qual serão inseridos números de forma ordenada, e que atenda as especificações a seguir: 
 
Passo 1: Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células; 
Passo 2: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. Deve-se sempre remover os dados da célula inicial da lista; 
Passo 3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células); 
Passo 4: Insira os números [6, 7, 8, 9 e 10] na lista; 
Passo 5: Repita os passos 2 e 3. 
Passo 6: Exiba todos os números que foram inseridos na fila. 
 
Analise a ordem dos números exibidos e verifique se estão na mesma forma que foram inseridos. Se a exibição foi diferente, justifique o ocorrido. 
 
O programa desenvolvido pelo aluno e a sua justificativa deverá ser postado em um ambiente virtual. Esse programa será avaliado pelo tutor responsável pela disciplina. 
# Justificativa

saída final
5 4 3 2 1 10 9 8 7 6 
Isso ocorre porque primeiro foram inseridos na Fila na ordem de saída da Pilha os números de 1 a 5 e depois na ordem de saída da Pilha os números de 6 a 10. Ou seja, foram inseridos os números invertidos de 1 a 5, e depois de novamente inverter os números de 6 a 10, foram inseridos estes números depois do último elemento da primeira inserção que era o 1.