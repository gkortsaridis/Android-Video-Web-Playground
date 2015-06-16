package gr.yoko.challengevideo;

import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.VideoView;


public class MainActivity extends ActionBarActivity {


    String url = "http://83.212.122.78/video1.mp4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView myVideoView = (VideoView)findViewById(R.id.myvideoview);
        myVideoView.setVideoURI(Uri.parse(url));
        myVideoView.setMediaController(new MediaController(this));
        myVideoView.requestFocus();
        myVideoView.start();

    }

}
