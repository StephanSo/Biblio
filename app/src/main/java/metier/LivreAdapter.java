package metier;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.ssonnois.biblio.R;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by ssonnois on 01/12/2017.
 */

public class LivreAdapter extends BaseAdapter {
    private List<Livre> listLivres;
    private LayoutInflater inflater;

    public LivreAdapter(Context context, List<Livre> listL){
        this.inflater=LayoutInflater.from(context);
        this.listLivres=listL;
    }
    public int getCount(){
        return this.listLivres.size();
    }

    public Livre getItem(int rang){
        return this.listLivres.get(rang);
    }

    public long getItemId(int i){
        return i;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        TextView titre;
        TextView resume;
        TextView isbn;
        if(convertView == null){
            convertView = this.inflater.inflate(R.layout.vue_livres,parent,false);
            titre = convertView.findViewById(R.id.txtTitre);
            resume = convertView.findViewById(R.id.txtResume);
            isbn= convertView.findViewById(R.id.txtIsbn);
            convertView.setTag(R.id.txtTitre, titre);
            convertView.setTag(R.id.txtResume, resume);
            convertView.setTag(R.id.txtIsbn, isbn);
        }
        else{
            titre =(TextView) convertView.getTag(R.id.txtTitre);
            resume =(TextView) convertView.getTag(R.id.txtResume);
            isbn=(TextView) convertView.getTag(R.id.txtIsbn);
        }
        Livre exo = this.getItem(position);
        titre.setText(exo.getTitre());
        resume.setText(exo.getResume());
        isbn.setText(exo.getIsbn());
        return convertView;
    }
}
