document.addEventListener('DOMContentLoaded', function() 
{
    const Loading = (loadingDelayHidden = 0) => 
    {
        let loading = document.querySelector('.loading');
        const myLoadingDelayHidden = loadingDelayHidden;
        let imgs = Array.from(document.images);
        let lenImgs = imgs.length;
        let counterImgsLoading = 0;
        
        function incrementCounterImgs() 
        {
            counterImgsLoading += 1;

            if (counterImgsLoading === lenImgs)
                hideLoading();
        }
        
        function hideLoading() 
        {
            if (loading !== null) 
            {
                loading.classList.remove('show');

                setTimeout(function() 
                {
                    loading.remove();
                }, myLoadingDelayHidden);
            }
        }
        
        if (imgs.length === 0) 
        {
            hideLoading();
        } 
        else 
        {
            imgs.forEach(function(img) 
            {
                if (img.complete) 
                {
                    incrementCounterImgs();
                } 
                else 
                {
                    img.addEventListener('load', incrementCounterImgs);
                    img.addEventListener('error', incrementCounterImgs); // Maneja errores de carga
                }
            });
        }
    };

    Loading(1000);
});