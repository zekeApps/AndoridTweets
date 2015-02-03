package com.mejorandola.android.list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mejorandola.android.R;
import com.mejorandola.android.models.Tweet;
import com.mejorandola.android.utils.BitmapManager;

import java.util.ArrayList;

/**
 * Created by zeke on 2/2/15.
 */
public class TweetAdapter extends ArrayAdapter<Tweet>{

    private Context context;
    private ArrayList<Tweet> tweets;
    public TweetAdapter(Context context, int viewResourceId, ArrayList<Tweet> tweets) {
        super(context, viewResourceId, tweets);
        this.context = context;
        this.tweets = tweets;
    }

    static class ViewHolder {
        public ImageView avatar;
        public  TextView name;
        public TextView screenName;
        public TextView text;
        public TextView createdAt;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.row_tweet, parent, false);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.avatar = (ImageView)convertView.findViewById((R.id.avatar));
            viewHolder.name = (TextView)convertView.findViewById(R.id.name);
            viewHolder.screenName = (TextView)convertView.findViewById(R.id.screen_name);
            viewHolder.text = (TextView)convertView.findViewById(R.id.text);
            viewHolder.createdAt = (TextView)convertView.findViewById(R.id.created_at);
            convertView.setTag(viewHolder);
        }
        ViewHolder holder = (ViewHolder)convertView.getTag();
        BitmapManager.getInstance().loadBitmap(tweets.get(position).getProfileImageUrl(),holder.avatar);
        holder.name.setText(tweets.get(position).getName());
        holder.screenName.setText(tweets.get(position).getScreenName());
        holder.text.setText(tweets.get(position).getText());
        holder.createdAt.setText(tweets.get(position).getCreatedAt());

        return convertView;
    }

}
