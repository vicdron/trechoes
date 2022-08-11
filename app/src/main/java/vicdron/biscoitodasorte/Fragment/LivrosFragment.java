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


public class LivrosFragment extends Fragment {
    private Button botaoNovaFrase;
    private ImageButton btshare;
    public String[] frases = {"Quando acordei hoje de manhã, eu sabia quem eu era, mas acho que já mudei muitas vezes desde então.- Alice no País das maravilhas – Lewis Carroll", "O verdadeiro amor nunca se desgasta. Quanto mais se dá mais se tem.O Pequeno Príncipe – Antoine de Saint-Exupéry", "Palavras são, na minha não tão humilde opinião, nossa inesgotável fonte de magia. Capazes de ferir e de curar.Harry Potter e as Relíquias da Morte – J.K. Rowling", "Alguns infinitos são maiores que outros. A Culpa é das Estrelas – John Green", "Que tempos penosos foram aqueles anos – ter o desejo e necessidade de viver, mas não a habilidade.Misto Quente – Charles Bukowski", "Que ninguém se engane, só consigo a simplicidade através de muito trabalho.A hora da Estrela – Clarice Lispector", "Há coisas que são preciosas por não durarem.Oscar Wilde", "Tudo o que temos de decidir é o que fazer com o tempo que nos é dado.Senhor dos Anéis- A sociedade do anel – J.R.R. Tolkien", "Todo mundo deveria ser aplaudido de pé pelo menos uma vez na vida, porque todos nós vencemos o mundo.— R. J. Palacio, Extraordinário", "Está morto: podemos elogiá-lo à vontade.— Machado de Assis, Contos: uma antologia", "Cada qual sabe amar a seu modo; o modo pouco importa; o essencial é que saiba amar.— Machado de Assis, Ressurreição", "Fiz café para o João e o José Carlos, que hoje completa 10 anos. Eu apenas posso dar-lhes os parabéns, porque hoje nem sei se vamos comer.— Carolina Maria de Jesus, Quarto de Despejo - Diário de uma favelada", "Filha, a gente não tem dinheiro para o presente, mas escolhe uma estrela no céu, e fica com ela pra toda a vida.— Jeannette Walls, O Castelo de Vidro", "Se tu vens, por exemplo, às quatro da tarde, desde as três eu começarei a ser feliz. Quanto mais a hora for chegando, mais eu me sentirei feliz.— Antoine de Saint-Exupéry, O Pequeno Príncipe", "Não tenha pena dos mortos, tenha pena dos vivos e, acima de tudo, daqueles que vivem sem amor.— J. K. Rowling, Harry Potter e as Relíquias da Morte", "Acho que tive medo de ser eu mesma a maior parte da minha vida.— J. A. Redmerski, Entre o Agora e o Nunca", "Deixe doer, mas não deixe de viver.— Júlia Faria, Para as solteiras, com amor", "Por você, faria isso mil vezes.— Khaled Hosseini, O caçador de Pipas", "Só se vê bem com o coração, o essencial é invisível aos olhos.— Antoine de Saint-Exupéry, O Pequeno Príncipe", "Você está livre para amar sem qualquer obrigação.— William P. Young, A Cabana", "Nós aceitamos o amor que achamos que merecemos.— Stephen Chbosky, As vantagens de ser invisível", "A única verdade que realmente sei: Os seres humanos me assombram.— Markus Zusak, A menina que roubava livros", "Um grande amor vale anos de espera.— Nora Roberts, Bem Casados", "Somos poeira estelar.— Jostein Gaarder, O Mundo de Sofia", "Às vezes, se apaixonar é a atitude mais corajosa que alguém pode ter.— Kiera Cass, A Coroa", "Também o amor se aprende.— Gabriel García Márquez, Crônica de uma morte anunciada", "Até mesmo os deuses têm que descansar.— PJ Pereira, Deuses de dois mundos: O livro da morte", "Sentir é estar distraído.— Fernando Pessoa, Poemas Completos de Alberto Caeiro", "Estou praticando ser gentil em vez de ter razão.— Matthew Quick, O Lado Bom da Vida", "Lembre-se de que há três coisas que todo sábio teme: o mar na tormenta, uma noite sem luar e a ira de um homem gentil.— Patrick Rothfuss, O Temor do Sábio – a Crônica do Matador do Rei - Segundo Dia", "Apenas viva bem. Apenas viva.— Jojo Moyes, Como eu era antes de você", "Nunca podemos julgar a vida dos outros, porque cada um sabe de sua própria dor e renúncia.— Paulo Coelho, Na Margem do Rio Piedra Eu Sentei e Chorei", "Estar perto não é físico.— Ismael Caneppele, Os famosos e os duendes da morte", "A morte é mais leve que a pluma. O dever, mais pesado que a montanha.— Robert Jordan, O Dragão Renascido", "Pensava que quando se sonha tão grande a realidade aprende.— Valter Hugo Mãe, O Filho de Mil Homens", "E eu percebi agora, que Deus nos dá a feiura, para que não deixemos as coisas bonitas da vida passarem desapercebidas.— Coollen Hoover, Ugly Love", "Amor não é coisa que se possa pedir a alguém.— Anne Frank, O Diário de Anne Frank", "O tempo faz com o corpo o que a ignorância faz com a alma, apodrece.— Carlos Ruiz Zafón, Marina", "De todas as dificuldades que uma pessoa tem de enfrentar, a mais sofrida é, sem dúvida, o simples ato de esperar— Khaled Hosseini, A Cidade do Sol"};
    String novafrase;
    private TextView textoNovaFrase;

    @Override // android.support.v4.app.vicdron.biscoitodasorte.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_livros, viewGroup, false);
        this.textoNovaFrase = (TextView) inflate.findViewById(R.id.textoNovaFrase);
        this.botaoNovaFrase = (Button) inflate.findViewById(R.id.botaoNovaFrase);
        this.btshare = (ImageButton) inflate.findViewById(R.id.btshare);
        this.botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nextInt = new Random().nextInt(LivrosFragment.this.frases.length);
                LivrosFragment.this.textoNovaFrase.setText(LivrosFragment.this.frases[nextInt]);
                LivrosFragment livrosFragment = LivrosFragment.this;
                livrosFragment.novafrase = livrosFragment.frases[nextInt];
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
                intent.addFlags(524288);
                intent.putExtra("android.intent.extra.TEXT", LivrosFragment.this.novafrase);
                LivrosFragment.this.startActivity(intent);
            }
        });
        return inflate;
    }
}
