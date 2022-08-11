package vicdron.biscoitodasorte.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import java.util.Random;
import vicdron.biscoitodasorte.R;


public class FilmesFragment extends Fragment {
    private Button botaoNovaFrase;
    private ImageButton btshare;
    public String[] frases =
            {"O homem que não reconhece o seu passado não terá futuro! - O Retorno da Múmia",
                    "As pessoas esperam que eu faça tudo por elas,  mas não percebem que elas têm o poder. Você quer um milagre? Seja um milagre. - O Todo Poderoso",
                    "O ontem é história, o amanhã é um mistério, mas o hoje é uma dádiva. É por isso que se chama presente. - Kung Fu Panda ",
                    "Sem o amargo, o doce não seria tão doce.- Vanilla Sky ", "Às vezes a ideia mais simples faz a maior diferença. - A Corrente do Bem",
                    "Se preocupar é como estar numa cadeira de balanço, te dá o que fazer mas não leva a lugar nenhum. - O Dono da Festa",
                    " A diferença do amor e o ódio é que por ódio você mata… por amor você morre! - Saída de Mestre",
                    "Nunca odeie seus inimigos, isso afeta seu julgamento.- O Poderoso Chefão 3",
                    "Não são nossos talentos que mostram aquilo que realmente somos, mas sim as nossas escolhas. - Harry Potter e a Câmara Secreta",
                    "Até uma boa decisão, se for tomada por motivos errados, pode ser uma má decisão. - Piratas do Caribe – A Maldição do Pérola Negra",
                    "Tudo é uma versão de outra coisa. - Closer – Perto Demais", "Só melhoramos se jogarmos com alguém melhor do que nós. - Match Point",
                    "Nunca desista, encontre um jeito, pois é assim que fazem os vencedores. - Tá Dando Onda",
                    "A jornada de mil quilômetros começa com o primeiro passo. - O Rei Leão 3: Hakuna Matata",
                    "As vezes vale a pena viver por aquilo que você morreria! - Heróis",
                    "A única pessoa em seu caminho é você mesmo. - Cisne Negro",
                    "Um guerreiro não desiste daquilo que ama, ele acha o amor naquilo que faz. - Poder além da vida",
                    "O poder de brilhar está em cada um de nós. - Coach Carter",
                    "Você pode conseguir tudo se você não tiver medo. - Demolidor – O Homem Sem Medo",
                    "O que fazemos na vida ecoa na eternidade. - Gladiador", "Não existe morte pior que o fim da esperança. - Rei Arthur",
                    "O poder real não vem do ódio, mas da verdade. - Abraham Lincoln: Caçador de Vampiros",
                    "Aprendi que a vida nem sempre acontece da maneira como a gente planeja. Mas às vezes, só às vezes, ela se torna melhor ainda - Eu Queria ter a Sua Vida",
                    "O homem é definido por seus atos, não por suas lembranças. - O Vingador do Futuro",
                    "Tudo que existe ou existiu, começou com um sonho. - As Aventuras de Sharkboy e Lavagirl",
                    "Por que você quer tanto isso? Porque disseram que eu não conseguiria. - Homens de Honra",
                    "Destino não é o caminho que nos é dado, é o caminho que escolhemos. - Megamente",
                    "A jornada é o que nos traz a felicidade. Não o destino. - Poder além da vida",
                    " E também sei como é importante na vida, não necessariamente ser forte, mas sentir-se forte.-Na Natureza Selvagem",
                    " A morte não é triste. O triste é que a maioria das pessoas não vive nada.- Poder além da vida",
                    " Eu sei o que eu tenho que fazer agora. Eu tenho que continuar respirando, porque quem sabe o que a maré me trará amanhã? - Náufrago",
                    " Não importa a cor do cabelo, o estilo das roupas, muito menos a cor da pele. Nada disso define caráter. - Histórias Cruzadas",
                    " A derrota sempre é momentânea. -King Kong",
                    " Eu aprendi faz muito tempo que não vale pena esquentar a cabeça toda vez que um bando de idiotas provoca você. - Madrugada Muito Louca",
                    " Não espere pelo último julgamento, ele acontece todos os dias. - Labirinto do Tempo",
                    " Se você vai para ou céu ou para o inferno, não é Deus quem decide, é você! - Cowboys & Aliens",
                    " Um verdadeiro herói não se mede pela força física, mas pela força do seu coração. - Hércules",
                    " Perdedor é aquele que tem medo de vencer, e acaba nem tentando. - Pequena Miss Sunshine",
                    " Capacidade de falar não é sinal de inteligência! - Star Wars – Episodio I: A Ameaça Fantasma",
                    " No relógio do tempo só há uma palavra escrita: agora. - O Tigre e a Neve",
                    " Os pequenos detalhes são sempre os mais importantes. - Sherlock Holmes",
                    " Dois ratos caíram em um pote de nata, O primeiro rato desistiu e se afogou, O segundo rato se esforçou tanto que transformou a nata em manteiga e saiu. - Prenda-me Se For Capaz",
                    " Nem sempre as aparências indicam a realidade. - Nosso Lar",
                    " Não fuja da verdade só porque ela o assusta. -Caso 39",
                    " Se você não lutar por alguma coisa, será vencido por qualquer coisa. -Sucker Punch",
                    " Você tem que deixar o passado para trás. O que importa é o que você escolhe ser a partir de agora. - Kung Fu Panda 2",
                    " As circunstâncias do nascimento de alguém são irrelevantes; é o que você faz com o dom da vida que determina quem você é. -Pokémon – O Filme",
                    " A vida pode derrubar, mas nós escolhemos se queremos levantar de novo. - Karate Kid", " Não existe inicio, nem chegada. Só o caminho. -Poder além da vida",
                    " Porque se disfarçar, se você pode se destacar? -Rango",
                    "  Quem vive de passado é museu. O futuro a gente faz agora. -Os Incríveis",
                    " Todas as coisas se encontram no caminho em algum lugar. - Fênomeno",
                    "  Você não pode exigir a resposta certa se fizer a pergunta errada. - Oldboy",
                    "  Você não pode tratar toda situação como se fosse caso de vida ou morte, porque vai morrer muitas vezes! - O Dono da Festa",
                    "  Eu achei que ser poderoso me daria a condição de ser amado. - Árvore da Vida",
                    " Lembrar é uma coisa, mas ficar nutrindo o ódio é outra coisa. - Os 300 de Esparta ",
                    "  Se você não sabe onde quer ir, qualquer caminho serve. - Alice no País das Maravilhas",
                    " É incrível o que a gente consegue quando tem um objetivo na vida. - Vício Frenético",
                    " Afinal, se eu não posso mudar junto com as circunstâncias, como posso esperar isso dos outros? - Invictus",
                    " As coisas mudam. E nós temos que mudar com elas. - Invictus",
                    " O perdão liberta a alma, ele afugenta o medo. Por isso é uma arma tão poderosa. - Invictus",
                    " Nossas vidas são definidas por oportunidades, mesmo as que perdemos. - O Curioso Caso de Benjamin Button",
                    " O amor é frágil e às vezes a gente se descuida. - A Última Música",
                    " Se você tem uma chance, torne-a realidade. - Gigantes de Aço",
                    " Não precisa ser fácil, só precisa ser possível! - Soul Surfer",
                    " O que quer que aconteça amanhã, tivemos o hoje! - Um Dia",
                    " Mas se as pessoas olhassem com mais cuidado uma pra outra, acho que seria diferente. - Era Uma Vez",
                    " Aconteça o que acontecer, controle o resultado, só depende de você. - Quebrando Regras",
                    "Não se pode substituir ninguém, porque todo mundo é uma soma de pequenos e belos detalhes. - Antes do Pôr-do-Sol",
                    " Nada acontece duas vezes da mesma maneira. - As Crônicas de Nárnia",
                    " As competições revelam nossas fraquezas e inflam o ego…Nossos verdadeiros inimigos somos nós mesmos. - O Mestre das Armas ",
                    " Nós pregamos melhor aquilo que mais precisamos aprender. - Lutero",
                    " Passamos muito tempo tentando organizar o mundo. Fazemos relógios, calendários e tentamos prever o clima. Mas que parte da nossa vida está realmente sob nosso controle? -72 Horas",
                    " Se prestarmos bastante atenção, sempre conseguiremos descobrir alguma compensação no sofrimento. - A Cabana",
                    " Gostaria de dizer isto: acho estranho os adultos discutirem tão fácilmente e com tanta frequência sobre coisas tão mesquinhas. Até agora eu achava que birra era uma coisa de criança e que a gente superava quando crescia. - O Diário de Anne Frank",
                    " Faz parte da vida o fato de que nem todas as coisas nas quais nos empenhamos dêem certo. - Uma Mente Brilhante",
                    " Ser vilão nem sempre é querer o mal, mas sim ter um pensamento diferente dos que acham estar fazendo o bem. - X-Men: Primeira Classe",
                    " O medo leva à raiva, a raiva leva ao ódio e o ódio leva ao sofrimento. - Star Wars",
                    " Não importa se foram 10 centímetros, ou 10 quilômetros. Vencer é vencer. - Velozes e Furiosos – Desafio em Tóquio",
                    " O futuro não está escrito. Nós fazemos nosso próprio destino. - O Exterminador do Futuro – A Salvação",
                    " Me vi no chão, sozinho, sem amigos ou qualquer outra pessoa do meu lado. Então tive que me levantar, tive que ser forte, ser forte por mim. - Querido John",
                    " Um homem brilhante encontraria a forma de não entrar em guerra. - Pearl Harbor",
                    " Paramos de procurar monstros embaixo da nossa cama quando percebemos que eles estão dentro de nós. - Batman – O Cavaleiro das Trevas",
                    " Se você liga para alguma coisa, lute por ela! Se bater em uma parede, atravesse-a! - As Aventuras de Tintim",
                    " Até mesmo os dias mais ensolarados podem ter algumas nuvenzinhas. - Os Muppets",
                    " Hoje dê um dos seus sorrisos a um estranho. Esse pode ser o único raio de sol que ele verá durante todo o dia. - P.S. Eu Te Amo",
                    " Ninguém sabe quanto tempo tem pra ficar com as pessoas que ama, por isso não perca tempo. - O Aprendiz de Feiticeiro",
                    " O futuro ainda não foi escrito, não existe, seu futuro é o que você quiser fazer. Portanto faça-o bem. - De Volta Para o Futuro III",
                    " Faça seus medos terem medo de você. - Batman – O Cavaleiro das Trevas", " Sua vontade determina seus limites. - Lanterna Verde",
                    " Você pode conseguir tudo se você não tiver medo. - Demolidor – O Homem Sem Medo", " A vida não é um ensaio, tem que aproveitar cada dia. - Santuário",
                    " A doença está na mente de cada um. - Jogos Mortais 7", " A gente pensa demais no tempo que nos resta e acaba não vivendo. - A Chave Mestra",
                    " Para ser um guerreiro, não se deve apenas empunhar uma espada. Deve-se ter uma razão pela qual empunhá-la. - Imortais",
                    " Nós somos só poeira e estamos de passagem. - Santuário", " As pessoas temem o que não entendem. - Superman: O Homem de Aço",
                    "“Por que tão sério?” – Em Batman, O Cavaleiro das Trevas;", "“Vamos colocar um sorriso nesse rosto” – Em Batman, O Cavaleiro das Trevas;", "“Meu nome é Bond, James Bond” – Famosa frase dos filmes do 007;", "“Eu sou o rei do mundo” – Em Titanic", "“Hasta la vista, Baby” – No filme Exterminador do Futuro 2", "“Dadinho é o caralh*, meu nome é Zé Pequeno porr*!” – No filme brasileiro Cidade de Deus;", "“Eu vejo pessoas mortas”- No filme O Sexto sentido", "“Olá… Eu quero jogar um jogo.“ – De Jigsaw nos filmes Jogos Mortais", "“Eu vou fazer uma proposta que ele não poderá recusar” – Do filme O Poderoso Chefão", "ËT telefone Casa” – No filme ET, O Extraterrestre", "“Eles podem tirar nossas vidas, mas nunca poderão tirar nossa liberdade” – De William Wallace no filme Coração Valente", "“Que os jogos começem” – No fllme “Jogos Mortais”", "“Nós sempre teremos Paris” – No filme “Casablanca’", "“A coisa mais importante que você pode aprender é só amar e ser amado em troca”- No filme Moulin Rouge", "“Grandes poderes trazem grandes responsabilidades” – No filme Homem Aranha", "“Que a força esteja com você” – No filme Star Wars", "“Não tente fazer, faça ou não faça.” – No filme Star Wars", "“Mim Tarzan, Você Jane” – No filme Tarzan", "“Slot quer chocolate!” – No filme Os goonies", "“Corra Forest, Corra” – no filme Forest Gump", "“Wilsoooooooonnnnnnnn”- No filme O Náufrago", "“Você não pode perder alguém que nunca teve” – No filme Como Perder um Homem em 10 dias", "“Você me faz querer ser um homem melhor” – No filme Melhor Impossível", "“O que você faz nesta vida ecoa na eternidade” – No filme O Gladiador", "“Não há lugar como nosso lar” – No filme O Mágico de OZ", "“Mantenha seus amigos por perto e os seus inimigos mais perto ainda.” – No filme O Poderoso Chefão 2", "“Eu sinto a necessidade – a necessidade de velocidade” – No filme Top Gun", "“Carpe diem. Aproveitem o dia, garotos. Façam suas vidas serem extraordinárias.” – No filme Sociedade dos Poetas Mortos", "“Elementar , meu caro Watson” – Scherlock Holmes", "“Eu amo o cheiro de napalm pela manhã” – No filme Apocalypse Now", "“Que dia excelente para um exorcismo” – O Exorcista", "“Primeira regra sobre o Clube da Luta — você não fala sobre o Clube da Luta.” – Em Clube da Luta", "“Minha mãe sempre dizia: a vida é como uma caixa de chocolate. Você nunca sabe o que vai encontrar” – Forrest Gump", "“Esse é o  dia que vocês sempre lembrarão como o dia em que vocês quase pegaram o Capitão Jack Sparrow” – Piratas do Caribe"};
    String novafrase;
    private TextView textoNovaFrase;

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_filmes, viewGroup, false);
        this.textoNovaFrase = (TextView) inflate.findViewById(R.id.textoNovaFrase);
        this.botaoNovaFrase = (Button) inflate.findViewById(R.id.botaoNovaFrase);
        this.btshare = (ImageButton) inflate.findViewById(R.id.btshare);
        this.botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int nextInt = new Random().nextInt(FilmesFragment.this.frases.length);
                FilmesFragment.this.textoNovaFrase.setText(FilmesFragment.this.frases[nextInt]);
                FilmesFragment filmesFragment = FilmesFragment.this;
                filmesFragment.novafrase = filmesFragment.frases[nextInt];
            }
        });
        this.btshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareText();
            }

            public void shareText() {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
               // intent.addFlags(524288);
                intent.putExtra("android.intent.extra.TEXT", FilmesFragment.this.novafrase);
                FilmesFragment.this.startActivity(intent);
            }
        });
        return inflate;
    }
}
