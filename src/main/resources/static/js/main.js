//alert("Funcionando");

let nome = document.getElementsByName("nome")[0];
let email = document.getElementsByName("email")[0];
let destino = document.getElementsByName("destino")[0];
let mensagem = document.getElementsByName("mensagem")[0];

let limpar = () =>{
  
        nome.value = "";
        email.value = "";
        destino.value = "";
        mensagem.value = "";

};

// <button type="button" onclick="limpar()">Limpar</button>
// Para impedir que o botão “Limpar” envie o formulário, você pode alterar o tipo de botão de “submit” para “button”. Dessa forma, o botão não enviará o formulário quando clicado.