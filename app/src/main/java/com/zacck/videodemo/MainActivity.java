package com.zacck.videodemo;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //lets play the video in the raw folder

        //get videoview
        VideoView mVideoView = (VideoView) findViewById(R.id.mVideoView);

        //get path for media
        mVideoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.demovideo);

        //lets add controls to our video
        MediaController mController = new MediaController(this);

        //attach controller to view
        mController.setAnchorView(mVideoView);

        //attach videoview to controller
        mVideoView.setMediaController(mController);

        mVideoView.start();

    }
}
