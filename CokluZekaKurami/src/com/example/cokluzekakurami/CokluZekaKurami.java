package com.example.cokluzekakurami;

import java.math.BigDecimal;

import com.example.cokluzekakurami.model.SorularVeCevaplari;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class CokluZekaKurami extends Activity {
	
	private static final String SORU_TURU_SOZEL="Sözel"; 
	private static final String SORU_TURU_SAYISAL="Sayısal"; 
	private static final String SORU_TURU_GORSEL="Görsel"; 
	private static final String SORU_TURU_RITMIK="Ritmik"; 
	private static final String SORU_TURU_DOGACI="Doğacı"; 
	private static final String SORU_TURU_SOSYAL="Sosyal"; 
	private static final String SORU_TURU_KINESTETIK="Kinestetik"; 
	private static final String SORU_TURU_ICEDONUK="İçe Dönük"; 
	
	private static final String DIALOG_TITLE="--->> Uyarı <---";
	private static final String RESULT_TITLE="--->> Anket Sonucu <---";
	private static final String TAMAM="TAMAM";

	private final SorularVeCevaplari [] sorular = { 
			new SorularVeCevaplari(R.string.question_sozel_1 ,null,SORU_TURU_SOZEL), 
			new SorularVeCevaplari(R.string.question_sozel_2, null,SORU_TURU_SOZEL),
			new SorularVeCevaplari(R.string.question_sozel_3 ,null,SORU_TURU_SOZEL),
			new SorularVeCevaplari(R.string.question_sozel_4, null,SORU_TURU_SOZEL),
			new SorularVeCevaplari(R.string.question_sozel_5 ,null,SORU_TURU_SOZEL),
			new SorularVeCevaplari(R.string.question_sozel_6 ,null,SORU_TURU_SOZEL),
			new SorularVeCevaplari(R.string.question_sozel_7 ,null,SORU_TURU_SOZEL),
			new SorularVeCevaplari(R.string.question_sozel_8 ,null,SORU_TURU_SOZEL),
			new SorularVeCevaplari(R.string.question_sozel_9 ,null,SORU_TURU_SOZEL),
			new SorularVeCevaplari(R.string.question_sozel_10 ,null,SORU_TURU_SOZEL),
			new SorularVeCevaplari(R.string.question_sayisal_1 ,null,SORU_TURU_SAYISAL), 
			new SorularVeCevaplari(R.string.question_sayisal_2, null,SORU_TURU_SAYISAL),
			new SorularVeCevaplari(R.string.question_sayisal_3 ,null,SORU_TURU_SAYISAL),
			new SorularVeCevaplari(R.string.question_sayisal_4, null,SORU_TURU_SAYISAL),
			new SorularVeCevaplari(R.string.question_sayisal_5 ,null,SORU_TURU_SAYISAL),
			new SorularVeCevaplari(R.string.question_sayisal_6 ,null,SORU_TURU_SAYISAL),
			new SorularVeCevaplari(R.string.question_sayisal_7 ,null,SORU_TURU_SAYISAL),
			new SorularVeCevaplari(R.string.question_sayisal_8 ,null,SORU_TURU_SAYISAL),
			new SorularVeCevaplari(R.string.question_sayisal_9 ,null,SORU_TURU_SAYISAL),
			new SorularVeCevaplari(R.string.question_sayisal_10 ,null,SORU_TURU_SAYISAL),
			new SorularVeCevaplari(R.string.question_gorsel_1 ,null,SORU_TURU_GORSEL), 
			new SorularVeCevaplari(R.string.question_gorsel_2, null,SORU_TURU_GORSEL),
			new SorularVeCevaplari(R.string.question_gorsel_3 ,null,SORU_TURU_GORSEL),
			new SorularVeCevaplari(R.string.question_gorsel_4, null,SORU_TURU_GORSEL),
			new SorularVeCevaplari(R.string.question_gorsel_5 ,null,SORU_TURU_GORSEL),
			new SorularVeCevaplari(R.string.question_gorsel_6 ,null,SORU_TURU_GORSEL),
			new SorularVeCevaplari(R.string.question_gorsel_7 ,null,SORU_TURU_GORSEL),
			new SorularVeCevaplari(R.string.question_gorsel_8 ,null,SORU_TURU_GORSEL),
			new SorularVeCevaplari(R.string.question_gorsel_9 ,null,SORU_TURU_GORSEL),
			new SorularVeCevaplari(R.string.question_gorsel_10 ,null,SORU_TURU_GORSEL),
			new SorularVeCevaplari(R.string.question_ritmik_1 ,null,SORU_TURU_RITMIK), 
			new SorularVeCevaplari(R.string.question_ritmik_2, null,SORU_TURU_RITMIK),
			new SorularVeCevaplari(R.string.question_ritmik_3 ,null,SORU_TURU_RITMIK),
			new SorularVeCevaplari(R.string.question_ritmik_4, null,SORU_TURU_RITMIK),
			new SorularVeCevaplari(R.string.question_ritmik_5 ,null,SORU_TURU_RITMIK),
			new SorularVeCevaplari(R.string.question_ritmik_6 ,null,SORU_TURU_RITMIK),
			new SorularVeCevaplari(R.string.question_ritmik_7 ,null,SORU_TURU_RITMIK),
			new SorularVeCevaplari(R.string.question_ritmik_8 ,null,SORU_TURU_RITMIK),
			new SorularVeCevaplari(R.string.question_ritmik_9 ,null,SORU_TURU_RITMIK),
			new SorularVeCevaplari(R.string.question_ritmik_10 ,null,SORU_TURU_RITMIK),
			new SorularVeCevaplari(R.string.question_dogaci_1 ,null,SORU_TURU_DOGACI), 
			new SorularVeCevaplari(R.string.question_dogaci_2, null,SORU_TURU_DOGACI),
			new SorularVeCevaplari(R.string.question_dogaci_3 ,null,SORU_TURU_DOGACI),
			new SorularVeCevaplari(R.string.question_dogaci_4, null,SORU_TURU_DOGACI),
			new SorularVeCevaplari(R.string.question_dogaci_5 ,null,SORU_TURU_DOGACI),
			new SorularVeCevaplari(R.string.question_dogaci_6 ,null,SORU_TURU_DOGACI),
			new SorularVeCevaplari(R.string.question_dogaci_7 ,null,SORU_TURU_DOGACI),
			new SorularVeCevaplari(R.string.question_dogaci_8 ,null,SORU_TURU_DOGACI),
			new SorularVeCevaplari(R.string.question_dogaci_9 ,null,SORU_TURU_DOGACI),
			new SorularVeCevaplari(R.string.question_dogaci_10 ,null,SORU_TURU_DOGACI),
			new SorularVeCevaplari(R.string.question_sosyal_1 ,null,SORU_TURU_SOSYAL), 
			new SorularVeCevaplari(R.string.question_sosyal_2, null,SORU_TURU_SOSYAL),
			new SorularVeCevaplari(R.string.question_sosyal_3 ,null,SORU_TURU_SOSYAL),
			new SorularVeCevaplari(R.string.question_sosyal_4, null,SORU_TURU_SOSYAL),
			new SorularVeCevaplari(R.string.question_sosyal_5 ,null,SORU_TURU_SOSYAL),
			new SorularVeCevaplari(R.string.question_sosyal_6 ,null,SORU_TURU_SOSYAL),
			new SorularVeCevaplari(R.string.question_sosyal_7 ,null,SORU_TURU_SOSYAL),
			new SorularVeCevaplari(R.string.question_sosyal_8 ,null,SORU_TURU_SOSYAL),
			new SorularVeCevaplari(R.string.question_sosyal_9 ,null,SORU_TURU_SOSYAL),
			new SorularVeCevaplari(R.string.question_sosyal_10 ,null,SORU_TURU_SOSYAL),
			new SorularVeCevaplari(R.string.question_kinestetik_1 ,null,SORU_TURU_KINESTETIK), 
			new SorularVeCevaplari(R.string.question_kinestetik_2, null,SORU_TURU_KINESTETIK),
			new SorularVeCevaplari(R.string.question_kinestetik_3 ,null,SORU_TURU_KINESTETIK),
			new SorularVeCevaplari(R.string.question_kinestetik_4, null,SORU_TURU_KINESTETIK),
			new SorularVeCevaplari(R.string.question_kinestetik_5 ,null,SORU_TURU_KINESTETIK),
			new SorularVeCevaplari(R.string.question_kinestetik_6 ,null,SORU_TURU_KINESTETIK),
			new SorularVeCevaplari(R.string.question_kinestetik_7 ,null,SORU_TURU_KINESTETIK),
			new SorularVeCevaplari(R.string.question_kinestetik_8 ,null,SORU_TURU_KINESTETIK),
			new SorularVeCevaplari(R.string.question_kinestetik_9 ,null,SORU_TURU_KINESTETIK),
			new SorularVeCevaplari(R.string.question_kinestetik_10 ,null,SORU_TURU_KINESTETIK),
			new SorularVeCevaplari(R.string.question_iceDonuk_1 ,null,SORU_TURU_ICEDONUK), 
			new SorularVeCevaplari(R.string.question_iceDonuk_2, null,SORU_TURU_ICEDONUK),
			new SorularVeCevaplari(R.string.question_iceDonuk_3 ,null,SORU_TURU_ICEDONUK),
			new SorularVeCevaplari(R.string.question_iceDonuk_4, null,SORU_TURU_ICEDONUK),
			new SorularVeCevaplari(R.string.question_iceDonuk_5 ,null,SORU_TURU_ICEDONUK),
			new SorularVeCevaplari(R.string.question_iceDonuk_6 ,null,SORU_TURU_ICEDONUK),
			new SorularVeCevaplari(R.string.question_iceDonuk_7 ,null,SORU_TURU_ICEDONUK),
			new SorularVeCevaplari(R.string.question_iceDonuk_8 ,null,SORU_TURU_ICEDONUK),
			new SorularVeCevaplari(R.string.question_iceDonuk_9 ,null,SORU_TURU_ICEDONUK),
			new SorularVeCevaplari(R.string.question_iceDonuk_10 ,null,SORU_TURU_ICEDONUK),
			new SorularVeCevaplari(R.string.question_son ,null,"")};

	private int index = -1;
	
	private TextView txtSorular; 
	private TextView txtCevap; 
	private EditText editCevap;
	private ImageButton btnGeri;
	private ImageButton btnIleri;
	private Button anketSonuc;
	private Button yeniAnket;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_coklu_zeka_kurami);
	
		editCevap= (EditText) findViewById(R.id.editCevap);
		txtCevap= (TextView) findViewById(R.id.txtCevap);
		txtSorular= (TextView) findViewById(R.id.txtSorular);
		
		btnIleri= (ImageButton) findViewById(R.id.btnIleri);
		btnIleri.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int count=index;
				index++;
				if (index >= sorular.length) index = 0;
				
				if(index==0){  // ekrana ılk sorunun gelmesi için sağ-oka basılır
					txtSorular.setText(sorular[index].getSorular());	
				}else if(index<=sorular.length-2){ // index her zaman sorular.length-1 eşit olacaktır.fakat sorular listesindeki en son soru bilgi amaclıdır. bu yuzden index==sorular.length-1  durumunda farklı işlem olacaktır
					
					if(editCevap.getText()!=null 
							&& !"".equalsIgnoreCase(editCevap.getText().toString())
							&& Integer.parseInt(editCevap.getText().toString())>=0
							&& Integer.parseInt(editCevap.getText().toString())<=4){
						
						sorular[count].setCevaplar(new BigDecimal(Integer.parseInt(editCevap.getText().toString()))); // her sağ-oka tıklandığında ekrandaki puan degeri bir onceki sorunun cevabı olur
						editCevap.setText(sorular[count].getCevaplar().toString());
						
						txtSorular.setText(sorular[index].getSorular());
						
						if(sorular[index].getCevaplar()==null){ // her yeni sorunun cevap puanı null ise ekrandaki puan alanı yeni değer için temizlenir
							editCevap.setText("");
						}else{// her yeni sorunun cevap puanı dolu ise kayıtlı cevap puanı ekranda kullanıcıya gösterilir
							editCevap.setText(sorular[index].getCevaplar().toString());
						}
							
				
					}else{// cevap puanı null ise ya da 0 - 4 puandan farklı ise uyarı mesajı gosterir
						--index;
						openDialog(DIALOG_TITLE,"En az 0 , en çok 4 puan verebilirsiniz ! Boş geçilemez !");
					}
					
				}else{ //index==sorular.length-1  durumunda bilgi amaclı yazı gorunur. butonlar ve cevap puanı ekranda gizlenir
					if(editCevap.getText()!=null 
							&& !"".equalsIgnoreCase(editCevap.getText().toString())
							&& Integer.parseInt(editCevap.getText().toString())>=0
							&& Integer.parseInt(editCevap.getText().toString())<=4){
						
						sorular[count].setCevaplar(new BigDecimal(Integer.parseInt(editCevap.getText().toString())));
						editCevap.setText(sorular[count].getCevaplar().toString());

						txtSorular.setText(sorular[index].getSorular());
						editCevap.setVisibility(View.GONE);
						txtCevap.setVisibility(View.GONE);
						btnGeri.setVisibility(View.GONE);
						btnIleri.setVisibility(View.GONE);
					}else{
						--index;
						openDialog(DIALOG_TITLE,"En az 0 , en çok 4 puan verebilirsiniz ! Boş geçilemez !");
					}
				}
			}
		});
		
		btnGeri= (ImageButton) findViewById(R.id.btnGeri);
		btnGeri.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				index--;
				if (index <= 0) index = 0;
				
				txtSorular.setText(sorular[index].getSorular());
				
				if(sorular[index].getCevaplar()!=null){// onceki sorunun cevap puanı dolu ise kayıtlı cevap puanı ekranda kullanıcıya gösterilir
					editCevap.setText(sorular[index].getCevaplar().toString());
				}
			}
		});
		
		anketSonuc= (Button) findViewById(R.id.anketSonuc);
		anketSonuc.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				if(!showResult()){  // tum sorular cevaplanmıssa asagıdaki işlem yapılır, bos cevap var ise uyarı mesajı gosterir
					
					BigDecimal sozelPuan=BigDecimal.ZERO; 
					BigDecimal sayisalPuan=BigDecimal.ZERO;
					BigDecimal gorselPuan=BigDecimal.ZERO; 
					BigDecimal ritmikPuan=BigDecimal.ZERO;
					BigDecimal dogaciPuan=BigDecimal.ZERO;
					BigDecimal sosyalPuan=BigDecimal.ZERO;
					BigDecimal kinestetikPuan=BigDecimal.ZERO;
					BigDecimal iceDonukPuan=BigDecimal.ZERO;		
					
					for (int i = 0; i < sorular.length; i++) {
						
						if(SORU_TURU_SOZEL.equalsIgnoreCase(sorular[i].getSoruTuru())){
							sozelPuan= sozelPuan.add(sorular[i].getCevaplar()!=null?sorular[i].getCevaplar():BigDecimal.ZERO );
						}else if(SORU_TURU_SAYISAL.equalsIgnoreCase(sorular[i].getSoruTuru())){
							sayisalPuan= sayisalPuan.add(sorular[i].getCevaplar()!=null?sorular[i].getCevaplar():BigDecimal.ZERO );
						}else if(SORU_TURU_GORSEL.equalsIgnoreCase(sorular[i].getSoruTuru())){
							gorselPuan= gorselPuan.add(sorular[i].getCevaplar()!=null?sorular[i].getCevaplar():BigDecimal.ZERO );
						}else if(SORU_TURU_RITMIK.equalsIgnoreCase(sorular[i].getSoruTuru())){
							ritmikPuan= ritmikPuan.add(sorular[i].getCevaplar()!=null?sorular[i].getCevaplar():BigDecimal.ZERO );
						}else if(SORU_TURU_DOGACI.equalsIgnoreCase(sorular[i].getSoruTuru())){
							dogaciPuan= dogaciPuan.add(sorular[i].getCevaplar()!=null?sorular[i].getCevaplar():BigDecimal.ZERO );
						}else if(SORU_TURU_SOSYAL.equalsIgnoreCase(sorular[i].getSoruTuru())){
							sosyalPuan= sosyalPuan.add(sorular[i].getCevaplar()!=null?sorular[i].getCevaplar():BigDecimal.ZERO );
						}else if(SORU_TURU_KINESTETIK.equalsIgnoreCase(sorular[i].getSoruTuru())){
							kinestetikPuan= kinestetikPuan.add(sorular[i].getCevaplar()!=null?sorular[i].getCevaplar():BigDecimal.ZERO );
						}else if(SORU_TURU_ICEDONUK.equalsIgnoreCase(sorular[i].getSoruTuru())){
							iceDonukPuan= iceDonukPuan.add(sorular[i].getCevaplar()!=null?sorular[i].getCevaplar():BigDecimal.ZERO );
						}
					}
					
					String sonuc="\n En yüksek puanınız zeka türünüzdür ! \n"
							+ "\n"
							+ "Sözel Puan : "+sozelPuan +"\n"
							+ "Sayısal Puan : "+sayisalPuan +"\n"
							+ "Görsel Puan : "+gorselPuan +"\n"
							+ "Ritmik Puan : "+ritmikPuan +"\n"
							+ "Doğacı Puan : "+dogaciPuan +"\n"
							+ "Sosyal Puan : "+sosyalPuan +"\n"
							+ "Kinestetik Puan : "+kinestetikPuan +"\n"
							+ "İçe Dönük Puan : "+iceDonukPuan +"\n";				
					
					openDialog(RESULT_TITLE,sonuc);
					
					yeniAnket= (Button) findViewById(R.id.yeniAnket);
					yeniAnket.setVisibility(View.VISIBLE);
					yeniAnket.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View v) {

							Intent i= new Intent(CokluZekaKurami.this,CokluZekaKurami.class); // Yeni anket için uygulama kensini baslatır
							startActivity(i);
						}
					});
				}
			}
		});
	}
	

	public void openDialog(String title,String message) {
				
		AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
		dlgAlert.setMessage(message);
		dlgAlert.setTitle(title);
		dlgAlert.setPositiveButton(TAMAM, null);
		dlgAlert.setCancelable(true);
		dlgAlert.create().show();

	}
	
	public boolean showResult() {
		
		boolean kontrol=false;
		
		for (int i = 0; i < sorular.length; i++) {
			if(i<sorular.length-1 && sorular[i].getCevaplar()==null){
				kontrol=true;
				break;
			}
		}
		
		if(kontrol){
			openDialog(DIALOG_TITLE,"Lütfen tüm soruları cevaplayınız !");
		}
		
		return kontrol;
	}
}
