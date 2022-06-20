public class PersonagemV2 {
    //atributos(variaveis)
    private String nome;
    private int energia;
    private int fome;
    private int sono;
    private final static int MAX_ENERGIA = 10;
    private final static int MIN_ENERGIA =0;
    private final static int MAX_FOME = 10;
    private final static int MIN_FOME = 0;
    private final static int MAX_SONO = 10;
    private final static int MIN_SONO = 0;

    //metodo de acessar (getter)
    public int getEnergia(){
        return energia;
    }

    public int getFome() {
        return fome;
    }

    public int getSono() {
        return sono;
    }

    public String getNome() {
        return nome;
    }

    //setter
    public void setNome(String nome){
        this.nome = nome;
    }


    public PersonagemV2(String nome){
        this();
        this.nome = nome;
    }

    public PersonagemV2(){
        this(MAX_ENERGIA, MIN_FOME, MIN_SONO);
    }
    
    public PersonagemV2 (int energia, int fome, int sono){
        this.energia = energia >= MIN_ENERGIA && energia <= MAX_ENERGIA ? energia : 10;
        this.fome = fome >= MIN_FOME && fome <= MAX_FOME ? fome : MIN_FOME;
        this.sono = sono >= MIN_SONO && sono <= MAX_SONO ? sono : MIN_SONO;
    }

    void cacar(){
        if(energia>=2){
            System.out.println(nome + " cacando...");
            //energia = energia -2;
            energia -=2;
        }
        else{
            System.out.printf(" %s sem energia para cacar...\n", nome);
        }
        fome = fome +1 <=10 ? fome + 1 : 10;
        sono = Math.min(sono + 1, 10);
    }

    void comer(){
        if (fome>=1){
            System.out.println(nome + " comendo...");
            energia = Math.min(energia + 1, 10);
            fome--;
        }
        else{
            System.out.printf(" %s sem fome...\n", nome);
        }
    }

    void dormir(){
        if(sono >=1){
            System.out.printf(" %s Dormindo...\n", nome);
            energia = energia + 1 <=10 ? energia + 1: 10;
            --sono;
        }
        else{
            System.out.printf(" %s sem sono...\n", nome);
        }
    }
    
    void imprimir(){
        System.out.printf("\n Energia: %d, fome: %d, Sono: %d", this.getEnergia(), this.getFome(), this.getSono());
    }
}