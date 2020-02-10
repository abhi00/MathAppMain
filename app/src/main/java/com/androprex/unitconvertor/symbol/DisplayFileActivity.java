package com.androprex.unitconvertor.symbol;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Toast;

import com.androprex.unitconvertor.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnDrawListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.listener.OnPageErrorListener;
import com.github.barteksc.pdfviewer.listener.OnRenderListener;
import com.github.barteksc.pdfviewer.listener.OnTapListener;

public class DisplayFileActivity extends AppCompatActivity {

    PDFView pdfView;
    int data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_file);
        pdfView = findViewById(R.id.pdf_viewer);

      data=  getIntent().getExtras().getInt("data");
      showResult();
    }

   public void showResult()
   {
       switch (data)
       {
           case 0:
               run("algebra_symbol-converted.pdf");
               break;

           case 1:
               run("basis_math_ symbols-converted.pdf");
               break;

           case 2:
               run("Calculus-converted.pdf");
               break;

           case 3:
               run("combinatorics_Symbols-converted.pdf");
               break;

           case 4:
               run("geometry_symbols-converted.pdf");
               break;

           case 5:
               run("greek_alphabet_ letters-converted.pdf");
               break;

           case 6:
               run("linear_algebra_Symbols-converted.pdf");
               break;

           case 7:
               run("logic_symbols-converted.pdf");
               break;

           case 8:
               run("numeral_symbols-converted.pdf");
               break;

           case 9:
               run("probability_and_statistics_symbols-converted.pdf");
               break;

           case 10:
               run("roman_numerals-converted.pdf");
               break;

           case 11:
               run("set_theory_symbols-converted.pdf");
               break;

       }


   }

    public void run(String pdffile)
    {
        pdfView.fromAsset(pdffile)
                .password(null)
                .defaultPage(0)
                .enableSwipe(true)
                .swipeHorizontal(false)
                .enableDoubletap(true).onDraw(new OnDrawListener() {
            @Override
            public void onLayerDrawn(Canvas canvas, float pageWidth, float pageHeight, int displayedPage) {

            }
        }).onDrawAll(new OnDrawListener() {
            @Override
            public void onLayerDrawn(Canvas canvas, float pageWidth, float pageHeight, int displayedPage) {

            }
        }).onPageError(new OnPageErrorListener() {
            @Override
            public void onPageError(int page, Throwable t) {
                Toast.makeText(DisplayFileActivity.this, "Error", Toast.LENGTH_SHORT).show();

            }
        }).onPageChange(new OnPageChangeListener() {
            @Override
            public void onPageChanged(int page, int pageCount) {

            }
        }).onTap(new OnTapListener() {
            @Override
            public boolean onTap(MotionEvent e) {
                return true;
            }
        }).onRender(new OnRenderListener() {
            @Override
            public void onInitiallyRendered(int nbPages, float pageWidth, float pageHeight) {

                pdfView.fitToWidth();
            }
        }).enableAnnotationRendering(true).invalidPageColor(Color.WHITE).load();


        pdfView.fromAsset("basis_math_ symbols-converted.pdf")
                .password(null)
                .defaultPage(1)
                .enableSwipe(true)
                .swipeHorizontal(false)
                .enableDoubletap(true).onDraw(new OnDrawListener() {
            @Override
            public void onLayerDrawn(Canvas canvas, float pageWidth, float pageHeight, int displayedPage) {

            }
        }).onDrawAll(new OnDrawListener() {
            @Override
            public void onLayerDrawn(Canvas canvas, float pageWidth, float pageHeight, int displayedPage) {

            }
        }).onPageError(new OnPageErrorListener() {
            @Override
            public void onPageError(int page, Throwable t) {
                Toast.makeText(DisplayFileActivity.this, "Error", Toast.LENGTH_SHORT).show();

            }
        }).onPageChange(new OnPageChangeListener() {
            @Override
            public void onPageChanged(int page, int pageCount) {

            }
        }).onTap(new OnTapListener() {
            @Override
            public boolean onTap(MotionEvent e) {
                return true;
            }
        }).onRender(new OnRenderListener() {
            @Override
            public void onInitiallyRendered(int nbPages, float pageWidth, float pageHeight) {

                pdfView.fitToWidth();
            }
        }).enableAnnotationRendering(true).invalidPageColor(Color.WHITE).load();

        pdfView.fromAsset("Calculus-converted.pdf")
                .password(null)
                .defaultPage(2)
                .enableSwipe(true)
                .swipeHorizontal(false)
                .enableDoubletap(true).onDraw(new OnDrawListener() {
            @Override
            public void onLayerDrawn(Canvas canvas, float pageWidth, float pageHeight, int displayedPage) {

            }
        }).onDrawAll(new OnDrawListener() {
            @Override
            public void onLayerDrawn(Canvas canvas, float pageWidth, float pageHeight, int displayedPage) {

            }
        }).onPageError(new OnPageErrorListener() {
            @Override
            public void onPageError(int page, Throwable t) {
                Toast.makeText(DisplayFileActivity.this, "Error", Toast.LENGTH_SHORT).show();

            }
        }).onPageChange(new OnPageChangeListener() {
            @Override
            public void onPageChanged(int page, int pageCount) {

            }
        }).onTap(new OnTapListener() {
            @Override
            public boolean onTap(MotionEvent e) {
                return true;
            }
        }).onRender(new OnRenderListener() {
            @Override
            public void onInitiallyRendered(int nbPages, float pageWidth, float pageHeight) {

                pdfView.fitToWidth();
            }
        }).enableAnnotationRendering(true).invalidPageColor(Color.WHITE).load();

    }
}
