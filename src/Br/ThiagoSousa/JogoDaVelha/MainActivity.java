package Br.ThiagoSousa.JogoDaVelha;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.view.View.*;
import android.hardware.display.*;

public class MainActivity extends Activity
{
    
    TextView isFimText, ganhadorX, ganhadorBolinha;
    private final String BOLINHA = "o";
    private final String X = "x";
    private final String QUADRADO = "quadrado";
    private View view;
    private String ultimoAJogar= "X";
    private Button btNewGame, btTeste;
    LinearLayout mainLinear, mainLinear2;
    

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setView(getLayoutInflater().inflate(R.layout.main, null)); 
        setContentView(getView());
        
        btNewGame = (Button) findViewById(R.id.mainButtonNewGame);
        //btTeste = (Button)findViewById(R.id.mainBTTeste);
        
        isFimText = (TextView) findViewById(R.id.mainTextViewIsFim);
        ganhadorX = (TextView) findViewById(R.id.mainTextViewGanhadorX);
        ganhadorBolinha = (TextView) findViewById(R.id.mainTextViewGanhadorBolinha);
        
        mainLinear = (LinearLayout)findViewById(R.id.mainLinearLayout);
        mainLinear2 = (LinearLayout)findViewById(R.id.mainLinearLayout02);
        
        
        
        /*/Evento de clique do botão de testes
        btTeste.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                
                 Button bt1 = (Button)findViewById(R.id.mainButton1);
                 Button bt2 = (Button)findViewById(R.id.mainButton2);
                 Button bt3 = (Button)findViewById(R.id.mainButton3);
                 Button bt4 = (Button)findViewById(R.id.mainButton4);
                 Button bt5 = (Button)findViewById(R.id.mainButton5);
                 Button bt6 = (Button)findViewById(R.id.mainButton6);
                 Button bt7 = (Button)findViewById(R.id.mainButton7);
                 Button bt8 = (Button)findViewById(R.id.mainButton8);
                 Button bt9 = (Button)findViewById(R.id.mainButton9);

                 bt1.setText("T");
                 bt2.setText("E");
                 bt3.setText("S");
                 bt4.setText("T");
                 bt5.setText("E");
                 bt6.setText("T");
                 bt7.setText("E");
                 bt8.setText("S");
                 bt9.setText("T");
                 
                 mainLinear.setBackgroundResource(R.drawable.temp_wallpaper);
                 
                 
                 
                 bt1.setBackgroundResource(android.R.color.holo_orange_dark);

                 
                
            }
        });*/
        
    }

    public void clickQuadrado(View v)
    {
        
        Button bt1 = (Button)findViewById(R.id.mainButton1);
        Button bt2 = (Button)findViewById(R.id.mainButton2);
        Button bt3 = (Button)findViewById(R.id.mainButton3);
        Button bt4 = (Button)findViewById(R.id.mainButton4);
        Button bt5 = (Button)findViewById(R.id.mainButton5);
        Button bt6 = (Button)findViewById(R.id.mainButton6);
        Button bt7 = (Button)findViewById(R.id.mainButton7);
        Button bt8 = (Button)findViewById(R.id.mainButton8);
        Button bt9 = (Button)findViewById(R.id.mainButton9);

        /*----------------------------------*/
        
        if(((Button)v).getText().equals("")){
        if (getUltimoAJogar().equals(X))
        {

            ((Button)v).setText(BOLINHA);
            setUltimoAJogar(BOLINHA);
        }
        else
        {((Button)v).setText(X);
        setUltimoAJogar(X);
        }
        
            if(bt1.getText() != ""
            && bt2.getText() != "" 
            && bt3.getText() != ""
            && bt4.getText() != ""
            && bt5.getText() != ""
            && bt6.getText() != ""
            && bt7.getText() != ""
            && bt8.getText() != ""
            && bt9.getText() != ""){                 
                Toast.makeText(getApplicationContext(), "Continue o game...",Toast.LENGTH_SHORT).show();
                isFimText.setText("Ainda não há um ganhador");
                ativarBotões(false);
                mainLinear.setBackgroundResource(R.drawable.temp_wallpaper);
                getActionBar().show();
            }
            if(bt1.getText() == X 
            && bt2.getText() == X 
            && bt3.getText() == X){
                Toast.makeText(getApplicationContext(), "Fim de jogo!!",Toast.LENGTH_SHORT).show();
                isFimText.setText("Acabou na primeira linha!!!!");
                ativarBotões(false);
                ganhadorX.setText(X);
                getActionBar().show();
                bt1.setBackgroundResource(android.R.color.holo_blue_dark);
                bt2.setBackgroundResource(android.R.color.holo_blue_dark);
                bt3.setBackgroundResource(android.R.color.holo_blue_dark);
                mainLinear2.setBackgroundResource(R.drawable.picsart_142938006054);
                
            }
            
            if(bt4.getText() == X 
               && bt5.getText() == X 
               && bt6.getText() == X){
                Toast.makeText(getApplicationContext(), "Fim de jogo!!",Toast.LENGTH_SHORT).show();
                isFimText.setText("Acabou na segunda linha!!!!");
                ativarBotões(false);
                ganhadorX.setText(X);
                getActionBar().show();
                bt4.setBackgroundResource(android.R.color.holo_green_light);
                bt5.setBackgroundResource(android.R.color.holo_green_light);
                bt6.setBackgroundResource(android.R.color.holo_green_light);
                mainLinear2.setBackgroundResource(R.drawable.picsart_142938037727);
            }
            
            if(bt7.getText() == X 
               && bt8.getText() == X 
               && bt9.getText() == X){
                Toast.makeText(getApplicationContext(), "Fim de jogo!!",Toast.LENGTH_SHORT).show();
                isFimText.setText("Acabou na terceira linha!!!!");
                ativarBotões(false);
                ganhadorX.setText(X);
                getActionBar().show();
                
                bt7.setBackgroundResource(android.R.color.holo_orange_light);
                bt8.setBackgroundResource(android.R.color.holo_orange_light);
                bt9.setBackgroundResource(android.R.color.holo_orange_light);
                mainLinear2.setBackgroundResource(R.drawable.picsart_142939727700);
            }
      
            if(bt1.getText() == X 
               && bt4.getText() == X 
               && bt7.getText() == X){
                Toast.makeText(getApplicationContext(), "Fim de jogo!!",Toast.LENGTH_SHORT).show();
                isFimText.setText("Acabou na primeira coluna!!!!");
                ativarBotões(false);
                ganhadorX.setText(X);
                getActionBar().show();
                bt1.setBackgroundResource(android.R.color.background_light);
                bt4.setBackgroundResource(android.R.color.background_light);
                bt7.setBackgroundResource(android.R.color.background_light);
                mainLinear2.setBackgroundResource(R.drawable.picsart_1429397603925);
            }

            if(bt2.getText() == X 
               && bt5.getText() == X 
               && bt8.getText() == X){
                Toast.makeText(getApplicationContext(), "Fim de jogo!!",Toast.LENGTH_SHORT).show();
                isFimText.setText("Acabou na segunda coluna!!!!");
                ativarBotões(false);
                ganhadorX.setText(X);
                getActionBar().show();
                bt2.setBackgroundResource(android.R.color.darker_gray);
                bt5.setBackgroundResource(android.R.color.darker_gray);
                bt8.setBackgroundResource(android.R.color.darker_gray);
                mainLinear2.setBackgroundResource(R.drawable.picsart_142939760967);
            }

            if(bt3.getText() == X 
               && bt6.getText() == X 
               && bt9.getText() == X){
                Toast.makeText(getApplicationContext(), "Fim de jogo!!",Toast.LENGTH_SHORT).show();
                isFimText.setText("Acabou na terceira coluna!!!!");
                ativarBotões(false);
                ganhadorX.setText(X);
                getActionBar().show();
                bt3.setBackgroundResource(android.R.color.holo_blue_bright);
                bt6.setBackgroundResource(android.R.color.holo_blue_bright);
                bt9.setBackgroundResource(android.R.color.holo_blue_bright);
                mainLinear2.setBackgroundResource(R.drawable.picsart_142939764576);
            }
            
            if(bt1.getText() == X 
               && bt5.getText() == X 
               && bt9.getText() == X){
                Toast.makeText(getApplicationContext(), "Fim de jogo!!",Toast.LENGTH_SHORT).show();
                isFimText.setText("Acabou na primeira diagonal!!!!");
                ativarBotões(false);
                ganhadorX.setText(X);
                getActionBar().show();
                bt1.setBackgroundResource(android.R.color.holo_purple);
                bt5.setBackgroundResource(android.R.color.holo_purple);
                bt9.setBackgroundResource(android.R.color.holo_purple);
                mainLinear2.setBackgroundResource(R.drawable.picsart_142939769245);
            }
            
            if(bt3.getText() == X 
               && bt5.getText() == X 
               && bt7.getText() == X){
                Toast.makeText(getApplicationContext(), "Fim de jogo!!",Toast.LENGTH_SHORT).show();
                isFimText.setText("Acabou na segunda diagonal!!!!");
                ativarBotões(false);
                ganhadorX.setText(X);
                getActionBar().show();
                bt3.setBackgroundResource(android.R.color.holo_red_dark);
                bt5.setBackgroundResource(android.R.color.holo_red_dark);
                bt7.setBackgroundResource(android.R.color.holo_red_dark);
                mainLinear2.setBackgroundResource(R.drawable.gato_chorando);
            }
            
            /*----------------------------------*/
            
            if(bt1.getText() == BOLINHA
               && bt2.getText() == BOLINHA
               && bt3.getText() == BOLINHA){
                Toast.makeText(getApplicationContext(), "Fim de jogo!!",Toast.LENGTH_SHORT).show();
                isFimText.setText("Acabou na primeira linha!!!!");
                ativarBotões(false);
                ganhadorBolinha.setText(BOLINHA);
                getActionBar().show();
                bt1.setBackgroundResource(android.R.color.holo_blue_light);
                bt2.setBackgroundResource(android.R.color.holo_blue_light);
                bt3.setBackgroundResource(android.R.color.holo_blue_light);
                mainLinear2.setBackgroundResource(R.drawable.picsart_142939769735);
            }

            if(bt4.getText() == BOLINHA
               && bt5.getText() == BOLINHA
               && bt6.getText() == BOLINHA){
                Toast.makeText(getApplicationContext(), "Fim de jogo!!",Toast.LENGTH_SHORT).show();
                isFimText.setText("Acabou na segunda linha!!!!");
                ativarBotões(false);
                ganhadorBolinha.setText(BOLINHA);
                getActionBar().show();
                bt4.setBackgroundResource(android.R.color.holo_green_dark);
                bt5.setBackgroundResource(android.R.color.holo_green_dark);
                bt6.setBackgroundResource(android.R.color.holo_green_dark);
                mainLinear2.setBackgroundResource(R.drawable.picsart_142939774145);
            }

            if(bt7.getText() == BOLINHA
               && bt8.getText() == BOLINHA
               && bt9.getText() == BOLINHA){
                Toast.makeText(getApplicationContext(), "Fim de jogo!!",Toast.LENGTH_SHORT).show();
                isFimText.setText("Acabou na terceira linha!!!!");
                ativarBotões(false);
                ganhadorBolinha.setText(BOLINHA);
                getActionBar().show();
                bt7.setBackgroundResource(android.R.color.holo_orange_dark);
                bt8.setBackgroundResource(android.R.color.holo_orange_dark);
                bt9.setBackgroundResource(android.R.color.holo_orange_dark);
                mainLinear2.setBackgroundResource(R.drawable.picsart_142939779478);
            }

            if(bt1.getText() == BOLINHA
               && bt4.getText() == BOLINHA
               && bt7.getText() == BOLINHA){
                Toast.makeText(getApplicationContext(), "Fim de jogo!!",Toast.LENGTH_SHORT).show();
                isFimText.setText("Acabou na primeira coluna!!!!");
                ativarBotões(false);
                ganhadorBolinha.setText(BOLINHA);
                getActionBar().show();
                bt1.setBackgroundResource(android.R.color.black);
                bt4.setBackgroundResource(android.R.color.black);
                bt7.setBackgroundResource(android.R.color.black);
                mainLinear2.setBackgroundResource(R.drawable.picsart_142997783056);
            }

            if(bt2.getText() == BOLINHA
               && bt5.getText() == BOLINHA
               && bt8.getText() == BOLINHA){
                Toast.makeText(getApplicationContext(), "Fim de jogo!!",Toast.LENGTH_SHORT).show();
                isFimText.setText("Acabou na segunda coluna!!!!");
                ativarBotões(false);
                ganhadorBolinha.setText(BOLINHA);
                getActionBar().show();
                bt2.setBackgroundResource(android.R.color.white);
                bt5.setBackgroundResource(android.R.color.white);
                bt8.setBackgroundResource(android.R.color.white);
                mainLinear2.setBackgroundResource(R.drawable.picsart_142939783603);
            }

            if(bt3.getText() == BOLINHA
               && bt6.getText() == BOLINHA
               && bt9.getText() == BOLINHA){
                Toast.makeText(getApplicationContext(), "Fim de jogo!!",Toast.LENGTH_SHORT).show();
                isFimText.setText("Acabou na terceira coluna!!!!");
                ativarBotões(false);
                ganhadorBolinha.setText(BOLINHA);
                getActionBar().show();
                bt3.setBackgroundResource(android.R.color.transparent);
                bt6.setBackgroundResource(android.R.color.transparent);
                bt9.setBackgroundResource(android.R.color.transparent);
                mainLinear2.setBackgroundResource(R.drawable.picsart_142939792364);
            }
            
            if(bt1.getText() == BOLINHA
               && bt5.getText() == BOLINHA
               && bt9.getText() == BOLINHA){
                Toast.makeText(getApplicationContext(), "Fim de jogo!!",Toast.LENGTH_SHORT).show();
                isFimText.setText("Acabou na primeira diagonal!!!!");
                ativarBotões(false);
                ganhadorBolinha.setText(BOLINHA);
                getActionBar().show();
                bt1.setBackgroundResource(android.R.color.transparent);
                bt5.setBackgroundResource(android.R.color.transparent);
                bt9.setBackgroundResource(android.R.color.transparent);
                mainLinear2.setBackgroundResource(R.drawable.picsart_1429397994419);
                }

            if(bt3.getText() == BOLINHA
               && bt5.getText() == BOLINHA
               && bt7.getText() == BOLINHA){
                Toast.makeText(getApplicationContext(), "Fim de jogo!!",Toast.LENGTH_SHORT).show();
                isFimText.setText("Acabou na segunda diagonal!!!! \nVersão do Android: "+Build.VERSION.RELEASE);
                
                ativarBotões(false);
                ganhadorBolinha.setText(BOLINHA);
                getActionBar().show();
                bt3.setBackgroundResource(android.R.color.holo_red_light);
                bt5.setBackgroundResource(android.R.color.holo_red_light);
                bt7.setBackgroundResource(android.R.color.holo_red_light);
                mainLinear2.setBackgroundResource(R.drawable.picsart_142939779478);
            
            }
}else{
    
   // Toast.makeText(getView().getContext(), v.getTag().toString() + " Já foi usado" , Toast.LENGTH_SHORT).show();
    Toast.makeText(getView().getContext(), v.getTag() +  " já foi usado", Toast.LENGTH_SHORT).show();
}
        
    }
    

    public void novoJogo(View v) {
       
       ((Button)findViewById(R.id.mainButton1)).setText("");
       ((Button)findViewById(R.id.mainButton2)).setText("");
       ((Button)findViewById(R.id.mainButton3)).setText("");
       ((Button)findViewById(R.id.mainButton4)).setText("");
       ((Button)findViewById(R.id.mainButton5)).setText("");
       ((Button)findViewById(R.id.mainButton6)).setText("");
       ((Button)findViewById(R.id.mainButton7)).setText("");
       ((Button)findViewById(R.id.mainButton8)).setText("");
       ((Button)findViewById(R.id.mainButton9)).setText("");
       
       ((Button)findViewById(R.id.mainButton1)).setEnabled(true);
       ((Button)findViewById(R.id.mainButton2)).setEnabled(true);
       ((Button)findViewById(R.id.mainButton3)).setEnabled(true);
       ((Button)findViewById(R.id.mainButton4)).setEnabled(true);
       ((Button)findViewById(R.id.mainButton5)).setEnabled(true);
       ((Button)findViewById(R.id.mainButton6)).setEnabled(true);
       ((Button)findViewById(R.id.mainButton7)).setEnabled(true);
       ((Button)findViewById(R.id.mainButton8)).setEnabled(true);
       ((Button)findViewById(R.id.mainButton9)).setEnabled(true);
       
        ((Button)findViewById(R.id.mainButton1)).setBackgroundColor(R.color.VERMELHO_ESCURO);
        ((Button)findViewById(R.id.mainButton2)).setBackgroundColor(R.color.VERMELHO_ESCURO);
        ((Button)findViewById(R.id.mainButton3)).setBackgroundColor(R.color.VERMELHO_ESCURO);
        ((Button)findViewById(R.id.mainButton4)).setBackgroundColor(R.color.VERMELHO_ESCURO);
        ((Button)findViewById(R.id.mainButton5)).setBackgroundColor(R.color.VERMELHO_ESCURO);
        ((Button)findViewById(R.id.mainButton6)).setBackgroundColor(R.color.VERMELHO_ESCURO);
        ((Button)findViewById(R.id.mainButton7)).setBackgroundColor(R.color.VERMELHO_ESCURO);
        ((Button)findViewById(R.id.mainButton8)).setBackgroundColor(R.color.VERMELHO_ESCURO);
        ((Button)findViewById(R.id.mainButton9)).setBackgroundColor(R.color.VERMELHO_ESCURO);
        
        int scrollSize = 1;
        int bottom = 100;
       
       //isFimText.setText( "Versão do seu SDK: ");
       mainLinear.setBackgroundColor(android.R.color.white);
       /*btNewGame.setBackgroundResource(R.color.VERMELHO_SANGUE);
       btNewGame.setTextColor(R.color.VERMELHO_SANGUE);*/
       isFimText.setText("");
       setUltimoAJogar(BOLINHA);
       ganhadorX.setText("");
       ganhadorBolinha.setText("");
       getActionBar().hide();
       btNewGame.setBottom(bottom);
       mainLinear2.setBackgroundResource(R.drawable.btn_blue_light);
       mainLinear.setBackgroundResource(R.drawable.temp_wallpaper);
        }
    
    public void isFim() {
       
        Button bt1 = (Button)findViewById(R.id.mainButton1);
        Button bt2 = (Button)findViewById(R.id.mainButton2);
        Button bt3 = (Button)findViewById(R.id.mainButton3);
        Button bt4 = (Button)findViewById(R.id.mainButton4);
        Button bt5 = (Button)findViewById(R.id.mainButton5);
        Button bt6 = (Button)findViewById(R.id.mainButton6);
        Button bt7 = (Button)findViewById(R.id.mainButton7);
        Button bt8 = (Button)findViewById(R.id.mainButton8);
        Button bt9 = (Button)findViewById(R.id.mainButton9);
        
        TextView isFimText = (TextView) findViewById(R.id.mainTextViewIsFim);
        
        if (bt1.getText() == bt2.getText()) {
            Toast.makeText(getApplicationContext(), "Fim de jogo!!!!",Toast.LENGTH_LONG).show();
        }
    
    }
    
    public void ativarBotões(boolean ativar) {

        ((Button)findViewById(R.id.mainButton1)).setEnabled(ativar);
        ((Button)findViewById(R.id.mainButton2)).setEnabled(ativar);
        ((Button)findViewById(R.id.mainButton3)).setEnabled(ativar);
        ((Button)findViewById(R.id.mainButton4)).setEnabled(ativar);
        ((Button)findViewById(R.id.mainButton5)).setEnabled(ativar);
        ((Button)findViewById(R.id.mainButton6)).setEnabled(ativar);
        ((Button)findViewById(R.id.mainButton7)).setEnabled(ativar);
        ((Button)findViewById(R.id.mainButton8)).setEnabled(ativar);
        ((Button)findViewById(R.id.mainButton9)).setEnabled(ativar);
        
    }
    
    public Button getQuadrado(int tagNum)
    {
        return (Button)getView().findViewWithTag(QUADRADO + tagNum);
    }
    
    public void setView(View view)
    {
        this.view = view;
    }

    public View getView()
    {
        return view;
    }

    public void setUltimoAJogar(String ultimoAJogar)
    {
        this.ultimoAJogar = ultimoAJogar;
    }

    public String getUltimoAJogar()
    {
        return ultimoAJogar;
    }
    
}
